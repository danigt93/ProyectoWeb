package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojos.Alumno;

/**
 * Servlet implementation class AlumnoServlet
 */

public class AlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String texto;
	private List<Alumno> alumnos; 
    /**
     * Default constructor. 
     */
    public AlumnoServlet() {
        System.out.println("Constuctor AlumnoServlet");
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
		
		HttpSession session = request.getSession();
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
		

		request.setAttribute("atributoListadoAlumnos", alumnoUsuario);
		RequestDispatcher rd = request.getRequestDispatcher("ejercicioalumno/listadoAlumnos.jsp"); 
		rd.forward(request, response);
		
		
	}

}
