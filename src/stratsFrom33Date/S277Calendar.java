package stratsFrom33Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class S277Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss:SS");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));

	}

}
