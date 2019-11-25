package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateRules
 */
@WebServlet("/CreateRules")
public class CreateRules extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateRules() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		doFer(request, response);	
  	}

  	/**
  	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  	 */
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		doFer(request, response);
  	}
  	
  	
  	public void doFer(HttpServletRequest request, HttpServletResponse response) throws IOException {
  		// TODO Auto-generated method stub
  		System.out.println("\nDins del CreateRules!");
  		
  		String ruleName = request.getParameter("ruleName");
  		String activeCheck = request.getParameter("activeCheck");
  		System.out.println(ruleName);
  		System.out.println(activeCheck);
  		
  		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/Rules");
			rd.forward(request, response);
		}
  		catch ( Exception e ) {e.printStackTrace();}
  	}

}
