package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPrueba
 */
public class ServletLeMans extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletLeMans() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String usuario = request.getParameter("Email");
		String password = request.getParameter("Password");
		String sessionId = request.getSession().getId();
		
		
		System.out.println("El "+ usuario + " ha entrado "+sessionId);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		List<String> usuarios = new ArrayList<String>();
		
		if (request.getParameter("usuario")!=null) {
			String usuario = request.getParameter("Email");
			String password = request.getParameter("Password");
			System.out.println("Se ha mandado el valor " + usuario + password);
			response.getWriter().append("<H5>INSERTADO CORRECTAMENTE</h5>");
			response.getWriter().append("<table>");
			response.getWriter().append("<th>Nombre</th><th>Apellidos</th>");
			for (String usuariox : usuarios) {
				response.getWriter().append("<tr>");
				
				response.getWriter().append("</tr>");
			}
			
			response.getWriter().append("</table>");
			
		}else {
			System.out.println("No llega nada");
			response.setContentType("text/html");
			response.getWriter().append("<H5 style='color:red'>HA HABIDO UN ERROR</h5>");
		}
	}
	
}
