package startsFrom32sec;

public class S259AusTraffic implements S259CentralTraffic {

     public static void main(String[] args) {
		// TODO Auto-generated method stub
		S259CentralTraffic a= new S259AusTraffic();
		a.redStop();
		a.GreenGo();
//      a.a=12;     // interface variable cannot changed
		
		S259AusTraffic at = new S259AusTraffic();
		at.walkSymbol();
		at.GreenGo();
		System.out.println("green go");

		
	}

	@Override
	public void GreenGo() {
		System.out.println("Green go");
	}
	public void walkSymbol() {
		System.out.println("walk");
	}
	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red stop");
	
	}
}
