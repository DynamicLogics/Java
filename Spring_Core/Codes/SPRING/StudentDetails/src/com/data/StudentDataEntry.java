package com.data;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentDataEntry {

@RequestMapping("/studentDataEntryPage")
public String enterStudentData() {
	return "StundentEntryForm";
}

@RequestMapping("/DisplayOnlyStudentName")
public String displayStudentNameOnly() {
	return "StudentNameDetails";
}

@RequestMapping("/DisplayDataUsingModel")
public String getStudentData(HttpServletRequest request,Model model) {
	String getName = request.getParameter("studentName");
	String setNameToCapital = getName.toUpperCase();
	model.addAttribute("modelStudentName",setNameToCapital);
	return "StudentDataRetrieveUsingModel";
}

}
