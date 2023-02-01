
package assignment;

public class QuickSort {
	
	
	// Helper function
	public static String quickSortOperation(int array[])
    {
 
		int startIndex = 0;
		int endIndex = array.length - 1;
		quickSort(array, startIndex, endIndex);
        
        return printArray(array);
    }
	
	/* A utility function to print array of size n */
    static String printArray(int arr[])
    {
        String result = "";
    	for (int i = 0; i < arr.length; i++)
            result = result + arr[i] + " ";
        
    	return result.trim();
    }
    
    /**
     * Implement quicksort recursively
     * Add additional methods if you need
     * low --> Starting index,
     * high --> Ending index
	 */
    static void quickSort(int arr[], int low, int high)
    {
    	
    	// Please do not remove this line from this quickSort method, this is for Gradescope purpose
        // Please comment out the below line when you want to test your solution in Eclipse or any editor. When you submit the file to Gradescope, enable the line. Without this line, Gradescope will not evaluate your sorting.
    	//assignment.MyStackTrace.printTrace("quickSort");

        /*** *** Write YOUR CODE HERE *** ***/ 
		// You can add additional methods if you need any
    	// Do not use java library for sorting, Gradesope will not evaluate if you use
    	if (low <= high) {
        int f = inPlacePartition(arr, low, high); // the addition of a partitioning method
        quickSort(arr, low, f-1);
        quickSort(arr, f+1, high);
    	}
    	
    }

     /**
     * Implement inPlacePartition
     * Add additional methods if you need
     * Return the position of the pivot
     * For this inPlacePartitioning method use the first element of the subarray as the pivot.
	 */
    public static int inPlacePartition(int arr[],int start/*low*/ ,int end/*high*/) {
        /*** *** Write YOUR CODE HERE *** ***/ 

        int pivot = arr[start];

        int i = (end + 1);

        for (int j = end; j > start ; j--) {

            if (arr[j] >= pivot) {

                i--;
                swap(arr, i, j);
            }
        }
        swap(arr, i - 1, start);
        return (i - 1);
    }
    
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}