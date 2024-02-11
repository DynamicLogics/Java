package MyServelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class SecondExample
 */
@WebServlet("/SecondExample")
public class SecondExample implements Servlet
{

    /**
     * Default constructor. 
     */
    public SecondExample() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() 
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo()
	{
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");//defining the content type ie text or html
		
		PrintWriter pr  = response.getWriter(); //server is preparing the response to the client
		       
		pr.println("Hello,Welcome to Servlets");//here we are delivering the response to the client
		
		pr.close();//here we are closing the connection
		
	}

}
