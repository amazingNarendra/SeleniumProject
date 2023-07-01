package stratsFrom33Date;

public class S290TryCatch {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		int[] c= {1,2};
		try 
		{
			System.out.println(c[1]);
			System.out.println(a/b);			
		}
		catch(ArithmeticException et)
		{
			System.out.println("inside arithmatic exception");
			System.out.println(et);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("in catch block");
			System.out.println(e);
			System.exit(0);
		}
		finally
		{
			System.out.println("inside finally block");
		}
	}
	

}
