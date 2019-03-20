import java.util.Scanner;

public class Intrest {
	public static void main(String[] args) {
		double principal;
		double time;
		double simpleInterst;
		double compoundInterst;
		double rate;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value of principal");
		principal=input.nextDouble();
		System.out.println("Enter value of time");
		time=input.nextDouble();
		System.out.println("Enter value of rate");
		rate=input.nextDouble();
		simpleInterst=(principal*time*rate)/100;
		System.out.println("Simple Interst is"+simpleInterst);
		compoundInterst=principal*(Math.pow(1+(rate/100), time));
		System.out.println("Compound Interst is"+compoundInterst);
		
		input.close();
	}
}
