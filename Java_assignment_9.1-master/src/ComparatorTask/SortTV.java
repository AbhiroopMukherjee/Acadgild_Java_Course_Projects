package ComparatorTask;

import java.util.Comparator;

public class SortTV implements Comparator<HDTV>{
	
	//Implementing compare method on the basis of the size member of class HDTV
	public int compare(HDTV t1, HDTV t2){
		if(t1.getSize()<t2.getSize()){
			return 1;
		}
		else{
			return -1;
		}
	}

	
}
