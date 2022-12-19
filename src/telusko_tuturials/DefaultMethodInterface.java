package telusko_tuturials;

interface Ai{
	void show();
	public default void abc() {
		System.out.println("in Ai default interface");
	}
}
interface Bi{
	
	public default void abc() {
		System.out.println("in Bi default interface");
	}
}

class B implements Ai,Bi{
	public void show() {
		System.out.println("in show");
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		Bi.super.abc();
//		or use below instead of above
//		System.out.println("in default show");
	}
}

public class DefaultMethodInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ai o=new B();
		o.show();
		o.abc();

	}

}
