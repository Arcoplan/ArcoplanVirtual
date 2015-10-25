package control;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;


@WebServlet("/DeleteProduct")
public class DeleteProductServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public DeleteProductServlet() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	private void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDao productDao = new ProductDao();
		String productId = request.getParameter("ID");
	
		try{
			productDao.delete(productId);
			
			RequestDispatcher rd;
			rd = getServletContext().getRequestDispatcher("/ListProduct"); 
			rd.forward(request, response);
			
		}
		catch (Exception e){
			throw new ServletException(e);
		}
	}	

}
