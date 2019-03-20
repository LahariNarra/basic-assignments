import java.util.Scanner;

public class SubjectMarks {
	public static void main(String[] args) {
		int englishMarks;
		int mathMarks;
		int scienceMarks;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter English Marks");
		englishMarks = input.nextInt();
		System.out.println("Enter Math Marks");
		mathMarks = input.nextInt();
		System.out.println("Enter Science Marks");
		scienceMarks = input.nextInt();
		if(englishMarks>=60 && mathMarks>=60 && scienceMarks>=60)
		{
			System.out.println("The student secured above 60 in every subject and the student is PASSED");
		}
		else if((englishMarks>=60 && mathMarks>=60 && scienceMarks<=60)
				||(englishMarks>=60 && mathMarks<=60 && scienceMarks>=60)
				||(englishMarks<=60 && mathMarks>=60 && scienceMarks>=60))
		{
			System.out.println("The student secured above 60 in two subject and the student is PROMOTED");
		}
		else
		{
			System.out.println("The student secured less than 60 and the student is Failed");
		}
		
		input.close();
	}
}
