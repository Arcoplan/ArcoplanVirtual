package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

@WebServlet("/ListProduct")
public class ListProductServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public ListProductServlet() {
	        super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	private void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			ProductDao productDao = new ProductDao();
			List<Product> products = productDao.listProducts();
			request.setAttribute("produtos", products);
			
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("listarProdutos.jsp");
			rd.forward(request, response);
		}
		catch (Exception e){ 
			throw new ServletException(e);
		}
	}
}
