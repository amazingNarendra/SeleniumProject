package telusko_tuturials;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5/6;
		try {
			if (i==0)
				throw new NaruException("this impossible");
			
		System.out.println(i);
		}
		catch(Exception e){
			System.out.println("error    " +e.getMessage());
		}

	}

}
