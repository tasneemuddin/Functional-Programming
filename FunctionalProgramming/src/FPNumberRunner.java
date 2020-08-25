import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(6);
		numbers.add(14);
		numbers.add(5);
		numbers.add(2);
		numbers.add(5);
		
		/**
		 * print all the numbers
		 * */
		System.out.println("----------------------------All Numbers----------------------------");
		numbers.stream().forEach(element -> System.out.println(element));
		
		
		/**
		 * print all the numbers sorted
		 * */
		System.out.println("----------------------------Sorted List----------------------------");
		numbers.stream().sorted().forEach(element -> System.out.println(element));
		
		
		/**
		 * print all the unique numbers
		 * */
		System.out.println("----------------------------Unique Numbers----------------------------");
		numbers.stream().distinct().forEach(element -> System.out.println(element));
		
		
		/**
		 * square each number
		 * */
		System.out.println("----------------------------Unique & Square Numbers----------------------------");
		numbers.stream().distinct().map(e -> e * e).forEach(element -> System.out.println(element));
		
		
		/**
		 * square of first 10 numbers
		 * */
		System.out.println("----------------------------First 10 Numbers Square----------------------------");
		IntStream.range(1, 10).map(e -> e * e).forEach(element -> System.out.println(element));
		
		/**
		 * square each number
		 * */
		System.out.println("----------------------------First Two Numbers----------------------------");
		numbers.stream().limit(2).forEach(element -> System.out.println(element));
		
		
		/**
		 * Calculate the sum of all the number using conventional way
		 * */
		int sum = 0;
		for(Integer num : numbers)
			sum += num;
		System.out.println("----------------------------Line Breaker----------------------------");
		System.out.println("Sum : "+sum);
		
		
		/**
		 * Calculate the sum of all the numbers using functional programming
		 * */
		sum = numbers.stream()
				.reduce(
				0, //Initial value of sum
				(number1, number2) -> number1 + number2);//Lambda Expression
		System.out.println("----------------------------Line Breaker----------------------------");
		System.out.println("Sum : "+sum);
		
		
		/**
		 * Calculate the sum of all ODD numbers using functional programming
		 * */
		sum = numbers.stream()
				.filter(number -> number%2 == 1)
				.reduce(
				0, //Initial value of sum
				(number1, number2) -> { //Lambda Expression
					return number1 + number2;
				});
		System.out.println("----------------------------Line Breaker----------------------------");
		System.out.println("ODD Number's Sum : "+sum);
	}
}
