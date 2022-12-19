import java.util.ArrayList;
import java.util.List;

public class Sec3javaSampleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array
		test();
	

	}
	
	public static void test() {
		
		String s1="hi bye hello";  //literal string
		String s2="hi";
		
		String s3=new String("hello");//new operator method
		String s4=new String("hello");
		
		System.out.println(s1+" "+s2 +" "+s3+" "+s4);
		String[] ss = s1.split("bye");
		System.out.printf(ss[0]+" "+ss[1]);	
		
//		
		List<String> a=new ArrayList<String>();
//		a.add("a");
//		a.add("b");
//		System.out.println(a.get(1));
//		
//	
//		array
		
//		int[] a=new int[5];
//		int[] a1= {1,2,3};
//		for(int i=0;i<a.length;i++)
//			System.out.println(a[i]);
//		for(int b:a1)
//			System.out.println(b);
		
	}

}
