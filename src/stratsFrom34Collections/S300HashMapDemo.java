package stratsFrom34Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class S300HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0, "Hi");
		hm.put(1, "Hello");
		hm.put(2, "how");
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		Set hms=hm.entrySet();
		System.out.println(hms);
		
		Iterator it=hms.iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry<Integer,String>)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		

	}

}
