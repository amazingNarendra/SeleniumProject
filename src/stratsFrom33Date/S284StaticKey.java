package stratsFrom33Date;

public class S284StaticKey {
	String name;
	static String city="pdtr";
	//	city="p";
	public S284StaticKey(String name)
	{
		this.name=name;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S284StaticKey s=new S284StaticKey("narendra");
		S284StaticKey s1=new S284StaticKey("marendra");
		System.out.println(s.name+"  "+city);  //s.city
		city="bangalore";
	    
	    System.out.println(s1.name+"  "+city);

	}

}
