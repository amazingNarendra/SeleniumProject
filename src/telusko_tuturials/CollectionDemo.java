package telusko_tuturials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> v=new ArrayList<>(); //yellow warning removed by generics
		v.add(1);
		v.add(12);
		v.add(0, 4);
		v.add(5);
		System.out.println(v);
		Collections.sort(v);
		Iterator<Integer> it= v.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	Collections.reverse(v);
	System.out.println("using enhanced for llop");
	for(Object o:v) {
		System.out.println(o);
	}

	}

}
