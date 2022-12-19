package telusko_tuturials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Stud implements Comparable<Stud>{
	int rollNo,marks;
	String name;
	public Stud(int rollNo, String name,int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(Stud s) {
		return name.length()>s.name.length()?1:-1;
	}
	
}

public class CollectionDemoComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stud> stud=new ArrayList<>(); //yellow warning removed by generics
		stud.add(new Stud(1,"naru",10));
		stud.add(new Stud(4,"maru",12));
		stud.add(new Stud(2,"jaru",8));
		
		Collections.sort(stud);
		for(Stud s:stud) {
			System.out.println(s);
		}

	}

}
