package startsFrom16;

public class practise {
	public static void Static() {
		System.out.println("static method");
	}
	public  void NonStatic() {
		System.out.println("Non static method");
	}
	public static void main(String[] args) {
		Static();  // without classname
		practise.Static();  //with classname
		System.out.println("HI Hi");
		System.out.println("develop branch");
		
		
	 practise p=new practise();
	 p.Static();// with object
	 p.NonStatic();
		
	}

}
