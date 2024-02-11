package MyServelets;


import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Parameter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form1Servelet
 */
@WebServlet("/Form1Servelet")
public class Form1Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form1Servelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");//defining the content type ie text or html
			PrintWriter pr  = response.getWriter(); //server is preparing the response to the client     
			
			pr.println("<center>");
			pr.println("<h1>Thanks for KYC</h1>");
			pr.println("</hr>");
			pr.println("Below Details Are Saved");
			
			Enumeration<String> e1 = request.getParameterNames(); 
			while(e1.hasMoreElements())
			{
				String parametername =e1.nextElement();
				
				String str = request.getParameter(parametername);
				
				//String[] str = request.getParameterValues(e1.nextElement());
				
				pr.println(str);
				
			}
			pr.close();//here we are closing the connection
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
