package stratsFrom34Collections;

import java.util.HashSet;
import java.util.Iterator;

public class S299HashNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet< String> h= new HashSet<String>();
		h.add("naren");
		h.add("krish");
		h.add("mahi");
		h.add("mahi");
		System.out.println(h);
		
		
		
		Iterator<String> i=h.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next() +" ");  //gives random value
		}

	}

}
