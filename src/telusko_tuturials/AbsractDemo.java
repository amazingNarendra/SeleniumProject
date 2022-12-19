package telusko_tuturials;
class Printer{
	public void show(Number i) {
		System.out.println(i);
	}
	
	
}

public class AbsractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer o=new Printer();
		o.show(10);
		o.show(10.5);
		o.show(10.5f);

	}

}
