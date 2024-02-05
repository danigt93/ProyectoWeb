package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpSession;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojos.Alumno;

public class servletEjercicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String texto;
	private List<Alumno> alumnos; 
    /**
     * Default constructor. 
     */
    public servletEjercicio() {
        System.out.println("Constuctor Alumno");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		alumnos = new ArrayList(); 
		texto = config.getInitParameter("textook");
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
		
		HttpSession session = (HttpSession) request.getSession();
		System.out.println(session.getId());
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String sex = request.getParameter("sex");
		String [] asignaturas = request.getParameterValues("asignatura");
		String desc = request.getParameter("descripcion");
		
		Alumno alumno = new Alumno(nombre,apellidos,sex,asignaturas, desc);
		
		for (String asignatura : asignaturas) {
			System.out.println(asignatura);
		}
		alumnos.add(alumno);
		
		
		List<Alumno> alumnoUsuario = new ArrayList();
		if (session.getAttribute("listadoAlumnos")==null) {
			
			alumnoUsuario.add(alumno);
			session.setAttribute("listadoAlumnos", alumnoUsuario);
		}else {
			alumnoUsuario = (List<Alumno>)session.getAttribute("listadoAlumnos");
			alumnoUsuario.add(alumno);
			session.setAttribute("listadoAlumnos", alumnoUsuario);
		}
		
		
		for (Alumno alumn : alumnoUsuario) {
			response.getWriter().append(texto + alumn.getNombre() + " "+ alumn.getApellidos() +"\n");
		}
		
		String html = "<!DOCTYPE html>"+
		"<html>"+
		"<head>"+
		"<meta charset='ISO-8859-1'>"+
		"<title>Insert title here</title>"+
		"</head>"+
		"<body>";

		for (int i=0; i<5; i++) {
			html+= "<p>Esto es una prueba de jsp</p>";
		}

		html+="</body>"+ "</html>";
		
		response.getWriter().append(html);
		
		
	}

}