package startsFrom32sec;

public class S269NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		System.out.println("loop values");
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(3*k+"\t ");
				
				k++;
			}
			System.out.println(" ");
		}
		System.out.println("loop ends");

	}

}

/*
3	  
6	 9	  
12	 15	 18	  
21	 24	 27	 30
 */
/*
 * 1234 
 * 567
 * 89 
 * 10
 */