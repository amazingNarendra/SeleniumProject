package stratsFrom34Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class S295ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		List<Integer> nums=Arrays.asList(3,6,2,4,6,7,5);
		a.add("Narenda");
		a.add("mahendra");
		System.out.println(a);
		a.add("jithendra");
		System.out.println(a);
	Collections.sort(a);
		for(String b:a) {  //using for each
			
				System.out.println(b);
		}
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(4);
		System.out.println(hs);
		System.out.println(hs.isEmpty()+"   "+hs.contains(2));
		for(int b:hs) {  //using for each
			
			System.out.println(b);
	}
	}
	

}
