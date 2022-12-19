package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Import packages   
import java.util.*;

//Creating RemoveDuplicatesExample1 class  
class RemovingDuplicates {
	public static void main(String[] args) {	
		String s="java is good to learn";
		
		String[] ws=s.split(" ");
		String rs="";
		for(String w:ws) {
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
		
			rs=rs+sb.toString()+" ";
		}
		System.out.println(rs);
	}
	
}
