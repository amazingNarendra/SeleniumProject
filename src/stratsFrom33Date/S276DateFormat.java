package stratsFrom33Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class S276DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d= new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY hh:mm:ss:SS");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		System.out.println(d);

	}

}
