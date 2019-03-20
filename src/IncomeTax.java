import java.util.Scanner;

public class IncomeTax {
	public static void main(String args[])
	{
		int annualIncome;
		float taxPay;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your annual income");
		annualIncome=input.nextInt();
		if(annualIncome<=180000)
		{
			System.out.println("You need not pay the income tax");
		}
		else if(annualIncome>=180000 || annualIncome<=300000)
		{
			System.out.println("You need to pay income tax of 10%");
			taxPay= (annualIncome*10)/100;
			System.out.println("Amount to be paid as tax is" +taxPay);
		}
		else if(annualIncome>=300000 || annualIncome<=500000)
		{
			System.out.println("You need to pay income tax of 20%");
			taxPay= (annualIncome*20)/100;
			System.out.println("Amount to be paid as tax is" +taxPay);
		}
		else if(annualIncome>=500000 || annualIncome<=100000)
		{
			System.out.println("You need to pay income tax of 10%");
			taxPay= (annualIncome*30)/100;
			System.out.println("Amount to be paid as tax is" +taxPay);
		}
		
		input.close();
	}

}
