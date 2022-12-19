package telusko_tuturials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionSortOnLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> v=new ArrayList<>(); //yellow warning removed by generics
		v.add(111);
		v.add(123);
		v.add(0, 400);
		v.add(514);
		
		Comparator<Integer> c= new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1%10>o2%10)
					return 1;
				else 
					return -1;
			}
		};
		Collections.sort(v,c);
	for(Integer o:v) {
		System.out.println(o);
	}

	}

}
