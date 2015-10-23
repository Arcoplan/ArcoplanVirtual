package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dados;
import model.Product;


@WebServlet("/RegisterProduct")
public class RegisterProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterProductServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	private void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
	    String svalue = request.getParameter("value");
	    String description = request.getParameter("description");
	    String smanufacturingDate = request.getParameter("manufacturingDate");
	    
		Product product = null;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
		try{
			Date manufacturingDate = df.parse(smanufacturingDate);
			Double value = Double.parseDouble(svalue);
			product = new Product(name, value, description, manufacturingDate);
		}
		catch (Exception e){
			throw new ServletException(e);
		}
	
		if(product != null) {
			Dados.cadastrarProduct(product);
			List<Product> lista = Dados.ListProducts();
			
			request.setAttribute("lista", lista);
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.write("<html><head><title>Produto Cadastrado</title></head><body>");
			out.write("<h1>Produtos cadastrados</h1><ol>");
			
			
			for(Product p : lista) out.write("<li><p>" + p.getName() +  "</p></li>");
			out.write("</ol>");
			
			out.write("<p><hr /></p><p><a href='index.html'</a>CadastrarProduto</p></body></html>");
			out.close();
		}
	
	}	
}
