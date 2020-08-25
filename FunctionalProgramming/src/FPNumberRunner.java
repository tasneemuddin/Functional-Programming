import java.util.ArrayList;
import java.util.List;

public class FPNumberRunner {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(6);
		numbers.add(14);
		numbers.add(5);
		numbers.add(2);
		
		/**
		 * print all the numbers
		 * */
		numbers.stream().forEach(element -> System.out.println(element));//print all the numbers
		System.out.println("----------------------------Line Breaker----------------------------");
		
		/**
		 * Calculate the sum of all the number using conventional way
		 * */
		int sum = 0;
		for(Integer num : numbers)
			sum += num;
		System.out.println("Sum : "+sum);
		System.out.println("----------------------------Line Breaker----------------------------");
		
		/**
		 * Calculate the sum of all the numbers using functional programming
		 * */
		sum = numbers.stream()
				.reduce(
				0, //Initial value of sum
				(number1, number2) -> number1 + number2);
		System.out.println("Sum : "+sum);
		System.out.println("----------------------------Line Breaker----------------------------");
		
		/**
		 * Calculate the sum of all ODD numbers using functional programming
		 * */
		sum = numbers.stream()
				.filter(number -> number%2 == 1)
				.reduce(
				0, //Initial value of sum
				(number1, number2) -> number1 + number2);
		System.out.println("ODD Sum : "+sum);
	}
}
