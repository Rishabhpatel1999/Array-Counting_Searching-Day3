package logical.question.array.day3;

import java.util.Scanner;

/*Question 21:
	 Write java method named findEvenandOddPositionElement that print
	 all the elements which is present at even index and also in odd index.*/

public class EvenAndOddPositionElement {
	
public static void main(String[] args) {
		
		int []nums=createArray();
		printArray(nums);
		findEvenAndOddPositionElement(nums);
		
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
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
	
	public static void findEvenAndOddPositionElement(int[] arr) {
        System.out.println("Elements at even positions:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Elements at odd positions:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

}
