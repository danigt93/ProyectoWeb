package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servletEjercicio {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("Nombre");
		String apellidos = request.getParameter("Apellidos");
		String sexo = request.getParameter("Sexo");
		String asignatura = request.getParameter("Asignatura");
		String textArea = request.getParameter("textArea");	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
			String nombre = request.getParameter("Nombre");
			String apellidos = request.getParameter("Apellidos");
			String sexo = request.getParameter("Sexo");
			String [] asignaturas = request.getParameterValues("Asignatura");
			String desc = request.getParameter("textArea");
			
//			Alumno alumno = new (nombre,apellidos,sexo,asignatura,desc);
			
			for (String asignatura : asignaturas) {
				System.out.println(asignatura);
			}
			
			
			response.getWriter().append("<h5> INSERTADO CORRECTAMENTE"+ nombre + apellidos + sexo + asignaturas + desc + "</h5>");
			response.getWriter().append("Nombre, Apellidos, Sexo, Asignatura, textArea");
			
	}
	
	
}
