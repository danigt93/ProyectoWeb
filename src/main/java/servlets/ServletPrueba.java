package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPrueba
 */
public class ServletPrueba extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletPrueba() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String texto = request.getParameter("numero");
		String sessionId = request.getSession().getId();
		int num = Integer.parseInt(texto);
		
		System.out.println("Ha entrado "+ num + " con el id "+sessionId);
		if(num%2==0) {
			
			response.getWriter().append("<H1>HOLA has introducido el "+ num +" que es par</h1");
			
		}else{response.getWriter().append("<H1>HOLA has introducido el "+ num +" que es impar</h1");
	  }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
