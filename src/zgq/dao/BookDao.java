package zgq.dao;

import java.util.Map;

import zgq.DB.DB;
import zgq.domain.Book;

public class BookDao {
//根据业务逻辑来 
	public Map getAll(){
		
		return DB.getAll();
	}
	
	public Book find(String id){
		
		return (Book) DB.getAll().get(id);
	}
}
