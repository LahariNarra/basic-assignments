import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int array[] = new int[10];
		int temp;
		int i, j;
		System.out.println("Enter the elements");
		Scanner input = new Scanner(System.in);
		for (i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Before sorting:");
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
		for (i = 0; i < (array.length) - 1; i++) {
			for (j = 0; j < (array.length - i - 1); j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("After sorting:");
		for (i= 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
		input.close();
	}
}
