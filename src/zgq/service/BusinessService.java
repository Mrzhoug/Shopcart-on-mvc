package zgq.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import zgq.dao.BookDao;
import zgq.domain.Book;
import zgq.domain.Cart;
import zgq.domain.CartItem;

public class BusinessService {
//ҵ����ͳһ��web���ṩ���з��� 
	private BookDao dao=new BookDao();
	public Map getAllBook(){
		
		return dao.getAll();
	}
	
	public Book findBook(String id){
		
		return dao.find(id);
	}
	
	//ɾ�����ﳵ�еĹ�����
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
