package RemoveDuplicateTask;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		//Initializing a list with duplicate string values
		List<String> al = new ArrayList<>();
		
		al.add("String1");
		al.add("String2");
		al.add("String3");
		al.add("String1");
		al.add("String3");
		
		//Changing the list to Set to remove the duplicate values
		Set<String> hs = new HashSet<>();
		hs.addAll(al);
		
		//Displaying both list and set
		System.out.println("List:"+ al);
		System.out.println("Set:"+ hs);

	}

}
