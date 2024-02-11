package MyServelets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Web2
 */
@WebServlet("/Web2")
public class Web2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Web2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");//defining the content type ie text or html	
		PrintWriter pr  = response.getWriter(); //server is preparing the response to the client	
		
		pr.println("<h1>MET BKC,CDAC Center</h1>");
		pr.println("<h2>Adgaon,Nashik</h2>");
		pr.println("</hr>");
		
		String value = request.getParameter("userinput");
		pr.println("Hello,"+value+" welcome to Servlets");//here we are delivering the response to the client		
		
		pr.println("</hr>");
		
		pr.close();//here we are closing the connection	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
