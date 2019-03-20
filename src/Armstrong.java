import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int number1;
		int sum = 0;
		int reverse;
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		number1 = input.nextInt();
		int newNumber=number1;
		System.out.println("The number  entered is " + number1);
		while (number1 != 0) {
			reverse = number1 % 10;
			sum = sum + reverse * reverse * reverse;
			number1 = number1 / 10;
		}
		if (sum == newNumber) {
			System.out.println("It is a armstrong number");
		} else {
			System.out.println("It is not armstrong");
		}
	}
}
