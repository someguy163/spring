package ja_code;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/ JSP");
		list.add(2,"Database");
		list.add("IBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 :" + size);
		System.out.println();
		String skill = list.get(2);
		System.out.println("2 " + skill);
		System.out.println();
		
		int i=0;
		for(String list2 : list) {
			System.out.println(i + " : " + list.get(i));
			i++;
		}
		
		
		System.out.println("remove2 -----");
		list.remove(2);
		
		int j=0;
		for(String list2 : list) {
			System.out.println(j + " : " + list.get(j));
			j++;
		}
		
	}

}
