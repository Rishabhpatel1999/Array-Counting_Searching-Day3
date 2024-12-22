package logical.question.array.day3;

/*Question 18:
a.Find Maximum Element in an Array.
 Input as: 6 3 2 1 5 5 4
 Output as: Max is: 6*/

import java.util.Scanner;

public class MaxElement {
	
public static void main(String[] args) {
		
		int []nums=createArray();
		printArray(nums);
		maxElement(nums);
		
	}
	
	public static int[] createArray() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of "+ size+" size array:");
		int []arr= new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr ;
	}
	
	public static void printArray(int []arr) {
		System.out.println("array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void maxElement(int[] arr) {
        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum element is: " + max);
    }

}
