package telusko_tuturials;

//class A{            //anonymous inner class
//	public void show() {
//		System.out.println("in  A");
//	}
//}

interface A{                  //anonymous with inteface
	public void show();
}
public class AnonymousClass_LambdaExpression {
	public static void main(String[] args) {
		A o=new A() {
			public void show() {
				System.out.println("in  anonymous");
			}
			
		};
		// use this instead of above 
//		A o=()->System.out.println("in  anonymous");
		o.show();
		o.show();
		
	}

}
