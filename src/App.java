import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = keyboard.next();
		System.out.println("Please enter your age");
		int age = keyboard.nextInt();
		System.out.println("Please enter your gender (Male or Female)");
		String gender = keyboard.next();
		System.out.println("Please enter your weight");
		int weight = keyboard.nextInt();
		System.out.println("Please enter your height");
		int height = keyboard.nextInt();
		
		Individual individual = new Individual();
		Individual individual2 = new Individual(name, age, gender);
		Individual individual3 = new Individual(name, age, gender, weight, height);

	} 

}
