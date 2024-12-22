package logical.question.array.day3;

import java.util.Scanner;

/*Find the median of a sorted array.
Test Case: 1
----------------
Array size: 6
Elements are: 1, 2, 3, 4, 5, 6
Median is: 3.5
Test Case: 2
----------------
Array size: 5
Elements are: 1, 2, 3, 4, 5
Median is: 3

*/
public class MedianOfSortedArray {
	
public static void main(String[] args) {
		
		int []nums=createArray();
		printArray(nums);
		int []arr=sort(nums);
		printArray(arr);
		median(arr);
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
		System.out.println("");
	}
	
	public static int [] sort(int []arr) {
		int t=0;
		System.out.println("sorted");
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		return arr;
	}
	
	public static void median (int []arr) {
		
		System.out.println("median of the sorted array is:");
		double median=0;
		if(arr.length%2==0) {
			
			median=(arr[arr.length/2]+arr[(arr.length/2) -1])/2.0 ;
			
		}
		else {
			median= arr[arr.length/2];
		}
		System.out.println(median);
	}

}
