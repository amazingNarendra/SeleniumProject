package startFrom10Sec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sec114JavaStream114 {
	@Test
	public void StreamFilter() {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("nari");
		names.add("mahi");
		names.add("nagi");

		int c = (int) names.stream().filter(s -> s.startsWith("n")).count();
		 System.out.println("starts with " +c);
		names.stream().filter(s->s.length()>2).forEach(s->System.out.println(s));
		//uppercase
		Long c1=Stream.of("anand","mouni","eshan").filter(s->s.startsWith("n")).count();
		System.out.println(c1);
//		names.stream().filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//		//sorted
		List<String> words= Arrays.asList("nagi","savithramma","sanjay");
//		words.stream().filter(s->s.contains("a")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
//		//concat
//		Stream<String>ns=Stream.concat(names.stream(), words.stream());
//		System.out.println("concat string");
		List<String> cl = Stream.concat(names.stream(), words.stream()).collect(Collectors.toList());
		System.out.println(cl);
		
//		//compare
//		boolean flag=ns.anyMatch(s->s.equalsIgnoreCase("nagi"));
//		System.out.println(flag);
//		Assert.assertTrue(flag);
//		//collection
		List<String> l=Stream.of("anand","mouni","eshan").map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l.get(0));
		//unique and sorting
		List<Integer> nums=Arrays.asList(3,6,2,4,6,7,5);
		nums.stream().distinct().sorted().forEach(s->System.out.print(" "+s));
		int[] i= {1,4,3,2};
		System.out.println("___________________");
		List<Integer>  il=Arrays.asList(1,2,3,4);
		System.out.println(il.get(0));
		
		il.stream().map(s->s.compareTo(2)).forEach(s->System.out.println(s));
		
		
		
		

	}

}
