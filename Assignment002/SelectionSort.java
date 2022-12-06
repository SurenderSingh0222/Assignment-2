
public class SelectionSort {
  public void sort(int array[]) {
	  
	  int min_index =0;
	  for( int i=0;i<array.length-1;i++) {
		  for(int j=i+1;j<array.length;j++) {
			  if(array[j]<= array[min_index]) {
				  min_index=j;
			  }
		  }
		  int temp=array[min_index];
		  array[min_index]=array[i];
		  array[i]=temp;
	  }
  }
  public void  printArray(int array[]) {
	  for(int i=0;i<array.length;i++)
		  System.out.print(array[i]+" ");
	  System.out.println();
  }
	public static void main(String[] args) {
	
     SelectionSort obj =new SelectionSort();
     int array[] = {64,25,12,22,11};
     obj.sort(array);
     System.out.println("Sorted Array");
     obj.printArray(array);
     

	}

}
