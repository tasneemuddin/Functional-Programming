import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FPStringRunner {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Guava");
		
		print_using_conventional_method(list);//print list using conventional method
		
		System.out.println("----------------------------Line Breaker----------------------------");
		
		print_using_functional_programming(list);//print list using functional programming
		
		System.out.println("----------------------------Line Breaker----------------------------");
		
		print_using_functional_programming_with_filter(list);//print list using functional programming and filter
		
		/**
		 * Lower Case print
		 * */
		System.out.println("----------------------------Map all to lowercase and print----------------------------");
		list.stream().map(e -> e.toLowerCase()).forEach(element -> System.out.println(element));
		
		
		/**
		 * Print the length of each element
		 * */
		System.out.println("----------------------------Length of each element----------------------------");
		list.stream().map(e -> e.length()).forEach(element -> System.out.println(element));
	}

	private static void print_using_conventional_method(ArrayList<String> list) {
		for(String element : list)
			System.out.println("element : "+element);
	}

	private static void print_using_functional_programming(ArrayList<String> list) {
		list.stream().forEach(element -> System.out.println("element : "+element + ", Length : "+element.length()));
	}
	
	private static void print_using_functional_programming_with_filter(ArrayList<String> list) {
		list.stream().filter(element -> element.endsWith("a")).forEach(element -> System.out.println("element : "+element));
	}
}