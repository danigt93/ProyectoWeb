package servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormularioServlet
 */
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FormularioServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Iniciando");
	}
	
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost FormularioServlet");
		
		String id = request.getSession().getId();
		System.out.println("El usuario con sesión "+id + " hace peticion");
		int contador = 0;
		do {
			
			System.out.println("El usuario con sesión "+id + " está dentro con contador: "+contador);
			contador++;
			try {
				System.out.println("pasa");
				Thread.sleep(10000);
				System.out.println("pasa1");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while (contador<12);
		
		System.out.println("El usuario con sesión "+id + " ha finalizado");
		
		String caja1 = request.getParameter("caja1");
		String caja2 = request.getParameter("caja2");
		response.setContentType("text/html");
		response.getWriter().append("<H2>Resultado: "+caja1+ " " + caja2 +"</H2>");
	}

}
