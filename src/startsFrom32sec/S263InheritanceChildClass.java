package startsFrom32sec;

public class S263InheritanceChildClass  extends S263InheritanceParentClass{
	public void  color() {
		int i=20;
		System.out.println(color);
	}

	public static void main(String[] args) {
		S263InheritanceParentClass c= new S263InheritanceChildClass();
		System.out.println(c.i);
		brakes();
		System.out.println(color);
		
		
		
	}
}
