public class ArmstrongRange {

	public static void main(String[] args) {
		
		
		for(int number=100;number<1000;number++)
		{
			int newNumber=number;
			int sum=0;
			int reverse;
			while (newNumber != 0) {
				reverse = newNumber % 10;
				sum = sum + reverse * reverse * reverse;
				newNumber = newNumber / 10;
			}
			if (sum == number) {
				System.out.println(number+"is armstrong number");
			} 	
		}
		
	}
}
