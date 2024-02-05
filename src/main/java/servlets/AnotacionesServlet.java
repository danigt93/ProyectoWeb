package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/anotacion")
@WebInitParam(name = "test", value = "Bienvenido")
public class AnotacionesServlet extends HttpServlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(config.getInitParameter("test"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet AnotacionesServlet");
		List<String> colores = new ArrayList();
		colores.add("Rojo");
		colores.add("Azul");
		colores.add("Amarillo");
		colores.add("Verde");
		
		System.out.println(colores.size());
		req.setAttribute("listaColores", colores);
		RequestDispatcher rd = req.getRequestDispatcher("listadoColores.jsp?numero=8");
		rd.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
	}
	
	

	
	
}
