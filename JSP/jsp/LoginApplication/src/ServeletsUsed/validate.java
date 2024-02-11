package ServeletsUsed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class validate
 */
@WebServlet("/validate")
public class validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validate() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");//defining the content type ie text or html
 		PrintWriter pr  = response.getWriter(); //server is preparing the response to the client   
		
		
		
		String value = request.getParameter("password");
		
		if(value.equals("manager"))
		{
			
			RequestDispatcher rs = request.getRequestDispatcher("success.jsp");
			rs.forward(request, response);
		
		}
		
		else
		{
			pr.println("opps...Wrong..Password..Entered");
			RequestDispatcher rs = request.getRequestDispatcher("LoginP.jsp");
			rs.forward(request, response);
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
