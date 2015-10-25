package control;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

@WebServlet("/UpdateProduct")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String productId;

    public UpdateProductServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao productDao = new ProductDao();
	    productId = request.getParameter("ID");
	    
	    try{
	    	Product product = productDao.searchProduct(productId);
	    	Date date = product.getManufacturingDate();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String dataFormatada = df.format(date);
			request.setAttribute("produto", product);
			request.setAttribute("data", dataFormatada);
			
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("alterarProduto.jsp");
			rd.forward(request, response);	
	    }
	    catch(Exception e){
			throw new ServletException(e);
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	
	private void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    ProductDao productDao = new ProductDao();
	    String auxManufacturingDate = request.getParameter("manufacturingDate");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	  
		try{
			Product product = productDao.searchProduct(productId);
			
			product.setName(request.getParameter("name"));
			product.setValue(Double.parseDouble(request.getParameter("value")));
			product.setDescription(request.getParameter("description"));
			Date manufacturingDate = df.parse(auxManufacturingDate);
			product.setManufacturingDate(manufacturingDate);
			
			productDao.updateProduct(product, productId);
			
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
		catch (Exception e){
			throw new ServletException(e);
		}
	}	

}
