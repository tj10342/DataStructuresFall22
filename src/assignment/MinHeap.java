package assignment;

public class MinHeap {
	
	static int[] minHeap;
	static int size_n;
	
	
	/**
	 * Helper functions
	 * MinHeapOperations will evaluate three operations: buildMinHeap, downHeap & upHeap
	 * Parameters:
	 * input: Integers from the Second line of input text
	 * newelements: Integers from the Third line of input text
	 * size: Input array size from the First line of input text
	 * The operations to be implemented:
	 * 1. buildMinHeap: Build the MinHeap
	 * 2. downHeap: Algorithm downheap restores the heap-order property by swapping key k along a downward path from the root. 
	 * 3. upHeap: The upheap process is used to add a node to a heap while maintaining the Heap property.
	 * heapSort and printMinHeapArray helper functions are added for generating the desired output.
	 */
	public String[] MinHeapOperations(int[] input, int[] newelements, int size) {
		
		// Assigning/Initiating the class static members
		minHeap = input.clone();
		size_n = size;
		
		// These two variables are needed for Gradescope evaluation
		String[] results = new String[3];
		String removedElements = "";
		
		
		buildMinHeap(minHeap, size_n);

		
		results[0] = printMinHeapArray(minHeap, size_n);
		System.out.println("Result after buildheap: " + results[0]);
		
		
		//Remove 5 minimum numbers from the MinHeap one by one.
		for(int i = 0; i < 5; i++) {
			removedElements = removedElements + removeMin(minHeap) + " ";
		}
		
		results[1] = removedElements.trim();
		System.out.println("Removed Elements: " + results[1]);
		
		
		//Insert the Elements from the newelements one by one.
		for (int i = 0; i < newelements.length; i++) {
			insert(minHeap, newelements[i]);
		}
		
		results[2] = heapSort(minHeap, size_n);
		System.out.println("HeapSort result: " + results[2]);
		
		
		return results;
		
	}
	
	// Helper function
	/* A utility function for heapSort operation */
	static String heapSort(int array[], int n)
    {
 
        // One by one extract an element from heap
        for (int i = n; i > 0; i--) {
             
            // Move current root to end
            int temp = array[1];
            array[1] = array[i];
            array[i] = temp;
            
            downHeap(array, 1, i-1);
        }
        
        return printMinHeapArray(array, n);
    }
	
	// Helper function
	/* A utility function to print array of size n */
	static String printMinHeapArray(int arr[], int n)
    {
        String result = "";
    	for (int i = 1; i <= n; ++i)
            result = result + arr[i] + " ";
        
    	return result.trim();
    }
	
	/** 
     * Helper function
	 * Remove the minimum/smallest elements from the MinHeap
     * During each removal process, ensure the MinHeap property.
     * minHeap array gets updated during this process
	 */
    public static int removeMin(int[] array) {
    	
    	int popped = array[1];
		array[1] = array[size_n];
		size_n--;
		
		downHeap(array, 1, size_n);
		
		return popped;
		
	}
    
    /*
     * Helper function
     * Insert the elements one by one in the MinHeap
     * Store the new item at the last empty cell in the array
     * minHeap array gets updated during this process
     */
    public static void insert(int[] array, int newelement) {
    	
    	size_n++;
	    int current = size_n;
	    array[current] = newelement;
	    
	    upHeap(array, size_n);
    }
    
	/**
     * Build the MinHeap
     * minHeap array gets updated during this process
	 */
    public static void buildMinHeap(int[] array, int size) {
		
    	/*** *** Write YOUR CODE HERE *** ***/
    			
	}
	
    
    /** 
     * After replacing the root key with the key of the last node, the heap-order property may be violated
	 * downHeap restores the heap-order  property by swapping key k along a downward path from the node at given index
	 */
    public static void downHeap(int arr[], int index, int size) {
		
		/*** *** Write YOUR CODE HERE *** ***/
		
	}
    
    /** 
   	 * During each insertion process, ensure the MinHeap property.
   	 * After the insertion of a new element, the heap-order property may  be violated. upHeap restores the heap-order property by swapping k along an upward path from the insertion node
   	 */
    public static void upHeap(int[] array, int size) {
		
		/*** *** Write YOUR CODE HERE *** ***/
		
	}

}
