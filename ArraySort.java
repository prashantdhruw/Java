
import java.util.Scanner;

public class ArraySort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the number you want upto");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("Sorted integers in Ascending Order");
		for (int i = 0; i < n; i++) {
			System.out.print(" , ");
			System.out.print(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted integers in descending order");
		for (int i = 0; i < n; i++) {
			System.out.print(" , ");
			System.out.print(arr[i]);
		}
	}
}
