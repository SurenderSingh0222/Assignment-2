import java.util.*;
public class QuickSort {
	public  int partition(int array[],int low,int high) {
		int pivot = array[high];
		int i= low-1;
		for(int j=low;j<high;j++) {
			if(array[j] <= pivot) {
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		i++;
		int temp =array[i];
		array[i]= pivot;
		array[high]=temp;
		return i;
	}
	public void quickSort(int array[],int low, int high) {
		if(low<=high) {
			int pindx = partition(array,low,high);
			quickSort(array,low,pindx-1);//call for smaller then pivot
			quickSort(array,pindx+1,high);//call for greater then pivot
		}
	}

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to store:");
		size=sc.nextInt();
		System.out.print("Enter the element in array:");
		
		int array [] = new int[size];
	    int n = array.length;
	    
	    for(int i=0;i<size;i++) {
	    	array[i]=sc.nextInt();
	    }
	    
	  
	   QuickSort obj = new QuickSort();
	   obj. quickSort(array,0,n-1);
	   obj.partition(array, 0, n-1);
	    System.out.println("Sorted Array");
	    //Print the array
	   for(int i=0;i<n;i++) {
		   
		   System.out.print(array[i]+" ");
	   }
	   System.out.println();
	    
     
	}

}
