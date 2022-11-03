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
    	assignment.MyStackTrace.printTrace("quickSort");

        /*** *** Write YOUR CODE HERE *** ***/ 
		// You can add additional methods if you need any
    	// Do not use java library for sorting, Gradesope will not evaluate if you use
    	
    }

     /**
     * Implement inPlacePartition
     * Add additional methods if you need
     * Return the position of the pivot
     * For this inPlacePartitioning method use the first element of the subarray as the pivot.
	 */
    public static int inPlacePartition(int arr[],int start ,int end) {
		
        /*** *** Write YOUR CODE HERE *** ***/ 
		// You can add additional methods if you need any
        //use the first element of the subarray as the pivot

        
    	return 0;
    }

    

}
