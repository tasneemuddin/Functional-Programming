import java.util.ArrayList;

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
		
	}

	private static void print_using_conventional_method(ArrayList<String> list) {
		for(String element : list)
			System.out.println("element : "+element);
	}

	private static void print_using_functional_programming(ArrayList<String> list) {
		list.stream().forEach(element -> System.out.println("element : "+element));
	}
	
	private static void print_using_functional_programming_with_filter(ArrayList<String> list) {
		list.stream().filter(element -> element.endsWith("a")).forEach(element -> System.out.println("element : "+element));
	}
}