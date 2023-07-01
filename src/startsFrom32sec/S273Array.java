package startsFrom32sec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class S273Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{3,6},{5,2}};
		int min = a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
				
				}
			}
		}
		System.out.println(min);
		
		
//		ArrayList<Integer> b= new ArrayList<>();
//		b.add(10);
//		b.add(2);
//		b.add(3);
//		b.add(11);
//		b.add(2);
//		
//		b.stream().distinct().forEach(s->System.out.println(s));		
//		int mini=b.get(0);
//		int maxi=b.get(0);
//		for(int i=0;i<b.size();i++) {
//			if(b.get(i)<mini)
//				mini=b.get(i);
//		}
//		for(int i=0;i<b.size();i++) {
//			if(b.get(i)>maxi)
//				maxi=b.get(i);
//		}
//		System.out.printf("mini and maxi are "+mini+" "+maxi+"\n");
//		Collections.sort(b);
//		System.out.println("after sorting");
//		for(int i=0;i<b.size();i++) {
//			System.out.print(b.get(i)+" ");
//		}
	}

}
