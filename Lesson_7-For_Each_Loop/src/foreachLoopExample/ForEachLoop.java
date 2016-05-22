package foreachLoopExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachLoop {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("aaaa");
		names.add("bbb");
		names.add(null);
		names.add("cccccccc");
		names.add("ddd");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("=========");

		//A for-each loop iterating over the List. 
		for (String curr : names) {
			System.out.println(curr);
		}

		System.out.println("=========");
		
		Set<String> setNames = new HashSet<>(names);

		for (String curr : setNames) {
			System.out.print(curr + ", ");
			if (curr != null) {
				System.out.println(curr.length());
			}
			System.out.println();
		}

	}
}
