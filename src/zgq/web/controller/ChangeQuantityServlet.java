package zgq.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zgq.domain.Cart;
import zgq.service.BusinessService;

//修改购物车中的指定书籍数量
public class ChangeQuantityServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id=request.getParameter("id");
		String quantity=request.getParameter("quantity");
		
		Cart cart=(Cart) request.getSession().getAttribute("cart");
		
		BusinessService service =new BusinessService();
		service.changeItemQuantity(id,quantity,cart);
		
		request.getRequestDispatcher("/WEB-INF/jsp/listcart.jsp").forward(request, response);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
