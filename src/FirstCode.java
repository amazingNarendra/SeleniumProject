class Emp 
{
	public int add(int ...n)
	{
		int sum=1;
		for(int i:n)
		{
			sum=sum*i;
		}
		return sum;
	}

	
}
class EmpAdv extends Emp
{
	
	public int sub(int i,int j) {
		return i-j;
	}
}
class Cal{
	public int add(int ...i) {
		int p=1;
		for(int j:i) {
			p=p*j;
		}
		return p;
	}
}


public class FirstCode 
{
	public static void main(String args[])
	{
	int a[][]= {{1,2},{2,3}};
	for(int b[]:a)
	{
		for(int c:b) {
			System.out.print(" "+c);
		}
		System.out.println();
	}
	
	Cal c=new Cal();
	System.out.println(c.add(1,2,3,4));
	
	}

}
