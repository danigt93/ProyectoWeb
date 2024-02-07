package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojos.Lampara;
import pojos.Mesa;
import pojos.Muebles;
import pojos.Sofa;



public class MueblesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Muebles> muebles;
	private String subtitulo;
   
    public MueblesServlet() {
    	
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Iniciando");
		subtitulo = getInitParameter("Subtitulo");
		muebles = new ArrayList<Muebles>();
	}
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Entrando doGet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		String tipo = request.getParameter("tipo");
		String nombre = request.getParameter("Nombre");
		double precio = Double.parseDouble("precio");
		
		
		if(tipo.equals("M")) {
			String estilo = request.getParameter("estilo");
			Mesa mesa = new Mesa(nombre, precio, estilo);
			muebles.add(mesa);
			
		}else if(tipo.equals("S")){
			String color = request.getParameter("color");
			Sofa sofa = new Sofa(nombre, precio, color);
			muebles.add(sofa);
			
		}else if(tipo.equals("L")){
			double potencia = Double.parseDouble(request.getParameter("potencia"));
			Lampara lampara = new Lampara(nombre, precio, potencia);
			muebles.add(lampara);
		}
		
		
		Map<String, Object> datos = new HashMap<String , Object>();
		datos.put("subtitulo", subtitulo);
		datos.put("listadoMuebles", muebles);
		
//		request.setAttribute("subtitulo", subtitulo);
//		request.setAttribute("listadoMuebles", muebles);
		
		request.setAttribute("mapa", datos);
		RequestDispatcher rd = request.getRequestDispatcher("EjercicioHerenciaWeb/listadoMuebles");
		
		rd.forward(request, response);
		
	}

}
