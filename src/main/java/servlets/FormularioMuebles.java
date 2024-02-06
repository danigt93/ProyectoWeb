package servlets;

import java.awt.Label;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojos.Alumno;
import pojos.Lampara;
import pojos.Mesa;
import pojos.Muebles;
import pojos.Sofa;



public class FormularioMuebles extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Muebles> mueble;
   
    public FormularioMuebles() {
    	
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Iniciando");
	}
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		
		String nombre = request.getParameter("Nombre");
		String precio = request.getParameter("Precio");
		String estilo = request.getParameter("Estilo");
		String color = request.getParameter("color");
		String potencia = request.getParameter("Potencia");
		
		
		Sofa sofa = new Sofa(nombre, precio, color);
		Mesa mesa = new Mesa(nombre, precio, estilo);
		Lampara lampara = new Lampara(nombre,precio,potencia);
		
		
		mueble.add(get);

		
		List<Muebles> muebleUsuario = new ArrayList();
		if (session.getAttribute("listadoMuebles")==null) {
			muebleUsuario.add((Muebles) mueble);
			session.setAttribute("listadoMuebles", muebleUsuario);
		}else {
			muebleUsuario = (List<Muebles>)session.getAttribute("listadoAlumnos");
			muebleUsuario.add((Muebles) mueble);
			session.setAttribute("listadoAlumnos", muebleUsuario);
		}
		

		request.setAttribute("listadoMuebles", muebleUsuario);
		RequestDispatcher rd = request.getRequestDispatcher("ejercicioalumno/listadoAlumnos.jsp"); 
		rd.forward(request, response); 
	}

}
