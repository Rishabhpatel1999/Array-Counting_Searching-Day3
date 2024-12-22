package logical.question.array.day3;

import java.util.Scanner;

/*Search for a given Element in an Array if present then print
"Element found at index : ", if not present print "Element not found"
 Input as: 1 4 3 5 2 6 5
 Enter searching element: 5
 Output: Element found at index 6

  Input as: 1 4 3 5 2 6
 Enter searching element: 7
 Output: Element not found*/
 
public class ElementFoundAtIndex {
	
	static Scanner sc =new Scanner(System.in);
public static void main(String[] args) {
		
		int []nums=createArray();
		printArray(nums);
		found(nums);
	}
	
	public static int[] createArray() {
		
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of "+ size+" size array:");
		int []arr= new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//sc.close();
		return arr ;
	}
	
	public static void printArray(int []arr) {
		System.out.println("array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void found(int []arr) {
		
		boolean flag=false;
		System.out.println("Enter searching element:");
		int element=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==element) {
				System.out.println("Element "+ element +" found at index "+i );
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Element Not found");
		}
		
}
}
