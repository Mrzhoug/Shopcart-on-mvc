package zgq.dao;

import java.util.Map;

import zgq.DB.DB;
import zgq.domain.Book;

public class BookDao {
//����ҵ���߼��� 
	public Map getAll(){
		
		return DB.getAll();
	}
	
	public Book find(String id){
		
		return (Book) DB.getAll().get(id);
	}
}
