import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		int array[]=new int[10];
		int search;
		int i;
		System.out.println("Enter the elements");
		Scanner input = new Scanner(System.in);
		for( i=0;i<array.length;i++)
		{
			array[i]=input.nextInt();
		}
		System.out.println("Enter element to be found");
		search = input.nextInt();
		for(i=0;i<=array.length;i++)
		{
			if(search==array[i])
			{
				System.out.println(search+"found at"+(i+1)+"position");
				break;
			}
			if(i==array.length-1)
			{
				System.out.println(search+ "is not found");
			}
		}
		input.close();
	}
}
