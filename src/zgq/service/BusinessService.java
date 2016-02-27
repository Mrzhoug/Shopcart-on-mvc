package zgq.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import zgq.dao.BookDao;
import zgq.domain.Book;
import zgq.domain.Cart;
import zgq.domain.CartItem;

public class BusinessService {
//业务类统一对web层提供所有服务 
	private BookDao dao=new BookDao();
	public Map getAllBook(){
		
		return dao.getAll();
	}
	
	public Book findBook(String id){
		
		return dao.find(id);
	}
	
	//删除购物车中的购物项
	public void deleteCartItem(String id,Cart cart){
		cart.getMap().remove(id);
	}

	public void clearCart(Cart cart) {
		cart.getMap().clear();
	}

	public void changeItemQuantity(String id, String quantity, Cart cart) {
		CartItem item=cart.getMap().get(id);
		item.setQuantity(Integer.parseInt(quantity));
	}
}
