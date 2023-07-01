package stratsFrom33Date;

public class S282ChildSuperDemo extends S282ParentSuperDemo {
	String name="ChildGlobal";
	public S282ChildSuperDemo()
	{
		super();
		System.out.println("child consructor");
	}
	public void getdata()
	{
		String name="ChildLocal";
//		System.out.println("child method");
		super.getdata();
	    System.out.println(name+" "+this.name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S282ChildSuperDemo c=new S282ChildSuperDemo();
		c.getdata();
		
	}

}
