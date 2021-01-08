package ComparatorTask;

import java.util.*;

public class HDTVRepo {

	public static void main(String[] args) {
		
		//Creating a list with HDTV datatype elements
		List<HDTV> list = new ArrayList<HDTV>();
		
		list.add(new HDTV("TVone",20));
		list.add(new HDTV("TVtwo",10));
		list.add(new HDTV("TVthree",15));
		list.add(new HDTV("TVfour",5));
		list.add(new HDTV("TVfive",25));
		
		//Sorting the objects on the basis of size member value using comparator
		Collections.sort(list,new SortTV());
		System.out.println("Sorted list:");
		
		//Displaying the sorted list
		for(HDTV t:list){
			System.out.println(t);
		}
		

	}

}
