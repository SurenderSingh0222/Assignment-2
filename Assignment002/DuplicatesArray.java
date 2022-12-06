import java.util.Scanner;

public class DuplicatesArray {

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
	    ;
	//int [] array = {1,2,3,78,5,9,7,6,0,1,2,5,5,3};
	System.out.print("Duplicate elements in given array:");
		for(int i =0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.print(" "+array[j]);
				}
			}
		}
		
		

	}

}
