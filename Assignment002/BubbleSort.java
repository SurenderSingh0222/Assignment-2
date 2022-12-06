import java.util.Scanner;

public class BubbleSort {
	 public void bubbleSort(int arr[], int n) {
	        boolean swapped;
	        for (int i = 0; i < arr.length - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < arr.length - i - 1; j++){
	                if (arr[j] >= arr[j + 1]){
	                     int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            if (swapped == false)
	                break;
	        }
	    }
	 public void printArray(int arr[], int size){
		 for (int i = 0; i < size; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to store:");
		size=sc.nextInt();
		System.out.print("Enter the element in array:");
		
		int arr [] = new int[size];
		
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
		//int arr[] = { 64, 34,11, 25, 12, 22, 11, 90 };
		BubbleSort obj = new BubbleSort();
        obj.bubbleSort(arr, arr.length);
        System.out.println("Sorted array: ");
        obj.printArray(arr, arr.length);
		
		}
	}


