package zgq.DB;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import zgq.domain.Book;

//�������ݿ�
public class DB {
	
	private static Map map = new LinkedHashMap();
	static{
		map.put("1", new Book("1","javaweb����","����",38,"һ������"));
		map.put("2", new Book("2","jdbc����","����",18,"һ������"));
		map.put("3", new Book("3","ajax����","��١",328,"һ������"));
		map.put("4", new Book("4","jbpm����","�ϱ�",58,"һ������"));
		map.put("5", new Book("5","struts����","�Ϸ�",28,"һ������"));
		map.put("6", new Book("6","spring����","�Ϸ�",98,"һ������"));
	}
	
	
	public static Map getAll(){
		return map;
	}
	
}
