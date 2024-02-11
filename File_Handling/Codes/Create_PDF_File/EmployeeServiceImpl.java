package com.plantManagementSystem.rest.service.Implementation;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.plantManagementSystem.rest.bean.EmployeeDetails;
import com.plantManagementSystem.rest.constant.ServiceConstants;
import com.plantManagementSystem.rest.dao_.EmployeeServiceDao;
import com.plantManagementSystem.rest.service_.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	boolean isUserValid;
	
	ServiceConstants serviceConstants = new ServiceConstants();
	
	@Autowired
	EmployeeServiceDao empDaoServ;
	
	@Override
	public EmployeeDetails addNewEmployees(EmployeeDetails empObj) {
		return empDaoServ.saveEmployeeDetails(empObj);
	}

	@Override
	public EmployeeDetails viewExistingEmployees(int userId) {
		return empDaoServ.fetchEmployeeDetails(userId);
	}
	
	@Override
	public String removeExistingEmployees(EmployeeDetails empObj) {
		return empDaoServ.removeEmployee(empObj);
	}

	@Override
	public boolean validateUserCredentials(String userName, String password) {
		return empDaoServ.validateUser(userName, password);
	}

	@Override
	public int getUserId(String userName, String password) {
		return empDaoServ.getUserId(userName, password);
	}

	@Override
	public String generateEmployeeRecord(int userId) {
		
		//fetching the employee information from database
		EmployeeDetails empDtls = empDaoServ.fetchEmployeeDetails(userId);
		
		ArrayList<String> employeeValues = serviceConstants.setEmployeeRecords(empDtls);
		
		ArrayList<String> employeeAttributes = serviceConstants.getEmployeeFields();
		
		//creating an document object which creates an generic empty document
		Document document = new Document(PageSize.A4,80,80,40,30);
        try {
        	//select the document in which you want to write data and select where the document should be generated finally
            PdfWriter.getInstance(document,new FileOutputStream(ServiceConstants.PDF_GENERATION_PATH+"Employee ID "+String.valueOf(empDtls.getUserId())+".pdf"));
           
            //open the empty document
            document.open();
             
            //create table in PDF file
            //'PdfPTable(2)' defining number of columns in the table
            PdfPTable table = new PdfPTable(2);
            
            //setting the title of PDF file
            document.addTitle(ServiceConstants.plantName);
           
            //declaring author name the PDF file
            document.addAuthor(ServiceConstants.authorName);
            
            //adding new text to PDF file
            Paragraph setPDFTile = new Paragraph(ServiceConstants.companyName, new Font(FontFamily.TIMES_ROMAN,24));
            
            //setting text alingment to center
            setPDFTile.setAlignment(Element.ALIGN_CENTER);
            
            //setting bottom space after this paragraph is generated
            setPDFTile.setSpacingAfter(20);
            
            //adding the text to document
            document.add(setPDFTile);
            
            //adding new text to PDF file
            Paragraph setEmployeeIntro = new Paragraph("Hi "+empDtls.getUserName()+" welcome Aboard!!!", new Font(FontFamily.TIMES_ROMAN,18));
            setEmployeeIntro.setAlignment(Element.ALIGN_LEFT);
            
            //setting bottom space after this paragraph is generated
            setEmployeeIntro.setSpacingAfter(10);
            document.add(setEmployeeIntro);
            
            //adding new text to PDF file
            Paragraph supportReach = new Paragraph(ServiceConstants.infoA, new Font(FontFamily.TIMES_ROMAN,12));
            supportReach.setAlignment(Element.ALIGN_LEFT);
            
            //setting bottom space after this paragraph is generated
            supportReach.setSpacingAfter(10);
            document.add(supportReach);
            
            //adding new text to PDF file
            Paragraph supportContact = new Paragraph(ServiceConstants.supportEmailAddress, new Font(FontFamily.TIMES_ROMAN,12));
            supportContact.setAlignment(Element.ALIGN_LEFT);
            
            //setting bottom space after this paragraph is generated
            supportContact.setSpacingAfter(20);
            document.add(supportContact);
            
            //adding dynamic employee related information to the table cells
            PdfPCell attributeValues;
            PdfPCell employeeData;
            
            for(int i=0;i<employeeValues.size();i++) {
        		attributeValues = new PdfPCell(new Paragraph(employeeAttributes.get(i)));
        		table.addCell(attributeValues);
        		employeeData = new PdfPCell(new Paragraph(employeeValues.get(i)));
        		table.addCell(employeeData);
            }
            
            //clearing the existing values from the 'employeeAttributes' arraylist object so this values won't get appended to new employee values
            employeeAttributes.clear();
            
            //clearing the existing values from the 'employeeValues' arraylist object so this values won't get appended to new employee values
            employeeValues.clear();
            
            //adding table object to document
            document.add(table);
            
            /*
             * remove the contents added to the table so next time when we call this function the previous 
             * table contents won't get appended to this table
            */
            table.flushContent();
            
            //closing the document
            document.close();
            
        } catch(Exception e){
        	System.out.println("Error generating PDF file");
        }
        return empDtls.toString();
	}
	
}