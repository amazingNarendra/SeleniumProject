package telusko_tuturials;
//abstract class Writer {
//	public abstract void write();
//}
interface  Writer {
	public abstract void write();
}
class Pen implements Writer{
	public void write() {
		System.out.println("In Pen");
	}
}
class Pencil implements Writer{
	public void write() {
		System.out.println("In Pencil");
	}
}


class Kit{
	public void doSomething(Writer p) {
		p.write();
	}
}

public class AbstractOrInheritaceOwnCreate {
	public static void main(String[] args) {
		Writer pc= new  Pencil();
		Writer p=new Pen();
		Kit k=new Kit();
		k.doSomething(p);
		k.doSomething(pc);
	
}
}
