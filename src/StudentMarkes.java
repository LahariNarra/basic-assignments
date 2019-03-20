import java.util.Scanner;

public class StudentMarkes {
	public static void main(String[] args) {
		
		int students[][];		
		int totalStudent=0;
		int totalSubject=0;
		float average;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no.of students");
		int studentCount = input.nextInt();
		System.out.println("Enter no.of subjects");
		int subjectCount = input.nextInt();
		students=new int[studentCount][subjectCount];
		System.out.println("Enter marks of students");
		for(int i=0;i<studentCount;i++)
		{
			for(int j=0;j<subjectCount;j++)
			{
				students[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<studentCount;i++)
		{
			for(int j=0;j<subjectCount;j++)
			{
				totalSubject=totalSubject+students[i][j];
				totalStudent=totalStudent+students[i][j];
			}
		System.out.println("Total of  Subjects is"+totalSubject);
		System.out.println("Average of  Subjects is"+(totalSubject/subjectCount));
		System.out.println("Total of  Student subject is"+totalStudent);
		System.out.println("Average of  Students Subject is"+(totalSubject/studentCount));
		}
		input.close();
	}
}
