package control;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;


@WebServlet("/RegisterProduct")
public class RegisterProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterProductServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("produto", "");
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("cadastrarProduto.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	private void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    ProductDao productDao = new ProductDao();
		Product product = new Product();
		
		String auxManufacturingDate = request.getParameter("manufacturingDate");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
		try{
			product.setName(request.getParameter("name"));
			product.setValue(Double.parseDouble(request.getParameter("value")));
			product.setDescription(request.getParameter("description"));
			Date manufacturingDate = df.parse(auxManufacturingDate);
			product.setManufacturingDate(manufacturingDate);
			
			productDao.createProduct(product);
		
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			
		}
		catch (Exception e){
			throw new ServletException(e);
		}
	}	
}
