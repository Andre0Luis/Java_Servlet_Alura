package br.com.andre.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
	
	Banco banco = new Banco();
	List<Empresa> lista = banco.getEmpresas();
	
	
	request.setAttribute("empresas", lista );
	//Estamos chamando o JSP
			RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
			rd.forward(request, response);
			
	}
}
