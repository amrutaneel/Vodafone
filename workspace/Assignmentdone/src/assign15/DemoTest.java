package assign15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class DemoTest {

	public static void main(String[] args) {
		//Set<String> names1 = new HashSet<>();
		List<String> names1 = new ArrayList<>();
		
		names1.add("Steven");
		names1.add("John");
		names1.add("Steven");
		names1.add("Leena");
		System.out.println("Size "+names1.size());
		System.out.println(names1);
//		Iterator<String> ii1 = names1.iterator();
//		while(ii1.hasNext()) {
//			String name  = ii1.next();
//			System.out.println(name);
//		}
		ListIterator<String> ii2 = names1.listIterator(names1.indexOf("Leena"));
		while(ii2.hasPrevious()) {
			String name = ii2.previous();
			System.out.println(name);
		}
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Steven");
		map.put(2, "Lex");
		map.put(3, "Steven");
		map.put(4, "John");
		System.out.println("Size "+map.size());
		System.out.println(map);
		Set<?> ss=	map.entrySet();		// convert to set 
		Iterator<?> ii = ss.iterator();
		while(ii.hasNext()) {
			Object name = ii.next();
			System.out.println(name);
		}
	}

}
