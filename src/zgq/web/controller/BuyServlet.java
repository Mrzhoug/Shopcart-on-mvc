package zgq.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zgq.domain.Book;
import zgq.domain.Cart;
import zgq.service.BusinessService;

//完成书籍购买
public class BuyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		BusinessService service = new BusinessService();
		Book book = service.findBook(id);
		
		//得到用户的购物车
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		if(cart==null){
			cart = new Cart();
			request.getSession().setAttribute("cart", cart);
		}
		
		//把书加到用户购物车中,完成购买
		cart.add(book);
		
		//response.sendRedirect("/WEB-INF/jsp/listcart.jsp");
		request.getRequestDispatcher("/WEB-INF/jsp/listcart.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
