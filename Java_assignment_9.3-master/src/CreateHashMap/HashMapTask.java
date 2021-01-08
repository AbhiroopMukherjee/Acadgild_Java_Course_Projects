package CreateHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {

	public static void main(String[] args) {
		//Creating Hashmap
		Map<Integer,String> employees = new HashMap<Integer,String>();
		
		//Adding values to HAshMap
		employees.put(100, "Abhi");
		employees.put(101, "Ravi");
		employees.put(102, "Kavi");
		employees.put(103, "Anil");
		employees.put(104, "Sunil");
		
		//Feting all the values of HAshMap
		System.out.println(employees.values());
		
	}

}
