package zgq.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zgq.domain.Cart;
import zgq.service.BusinessService;
//删除指定的购物项
public class DeleteItemServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id=request.getParameter("id");
		Cart cart=(Cart) request.getSession().getAttribute("cart");
		
		BusinessService service=new BusinessService();
		service.deleteCartItem(id,cart);
		
		//删除成功
		request.getRequestDispatcher("/WEB-INF/jsp/listcart.jsp").forward(request, response);
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
