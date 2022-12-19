package telusko_tuturials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedBufferReadException {
	public static void main(String[] args) throws IOException  {
		int n = 0;
		System.out.println("num Pls");
		BufferedReader br=null;
	   try {
		br= new BufferedReader(new InputStreamReader(System.in));
		 n=Integer.parseInt(br.readLine());
	   }
	   catch(Exception e) {
		   System.out.println("error");
	   }
	   finally {
		br.close();
	}
	   //use only try block with resource without finallyblock
//	   try( BufferedReader br1= new BufferedReader(new InputStreamReader(System.in))) {
//		   n=Integer.parseInt(br.readLine());
//	   }
		System.out.println(n);
	}

}
