package assignment;

public class BSTOperations {
	
	static String inOrderResult = "";
	static String searchResult = "";
	
	// Initializing the root node of the BST
	Node bstRoot = null; 
 
	// Basic structure of Node
	static class Node
	{
	    int key;
	    Node left, right;
	}
	 
	// A utility function to create a new BST node
	static Node newNode(int item)
	{
	    Node temp = new Node();
	    temp.key = item;
	    temp.left = temp.right = null;
	    return temp;
	}
	 
	// Helper function
	// InOrder traversal of BST, This will generate a sorted List
	static void inOrder(Node root)
	{
	    if (root != null)
	    {
	    	inOrder(root.left);
	    	inOrderResult = inOrderResult + root.key + " ";
	    	inOrder(root.right);
	    }
	    
	}
	
	// Helper function to get the BST height(Level)
	static int bstHeight(Node root) {
	    if (root == null) {
	        return -1;
	    }

	    int lefth = bstHeight(root.left);
	    int righth = bstHeight(root.right);

	    if (lefth > righth) {
	        return lefth + 1;
	    } else {
	        return righth + 1;
	    }
	}
	
	// Helper function to generate InOrder sequence after Insertion operation
	public String insertOperationInBST(int[] inputarray) {
		
		for (int i = 0; i < inputarray.length; i++) {
			if(bstRoot == null) {
				//Setting the root
				bstRoot = newNode(inputarray[i]);
			}
			else
				insert(bstRoot, inputarray[i]);
	    }
		
		// Generating inorder traversal output for Gradescope evaluation
		inOrderResult = "";
		System.out.println(bstHeight(bstRoot));
		inOrder(bstRoot);
		return inOrderResult.trim();
	}
	
	// Helper function to generate InOrder sequence after Deletion operation
	public String deleteOperationInBST(int[] deleteelementsarray) {
		
		for (int i = 0; i < deleteelementsarray.length; i++) {
			
			Node removedNode = delete(deleteelementsarray[i]);
			if(removedNode == null) {
				System.out.println("The key " + deleteelementsarray[i] + " is not present in the tree");
			}
			else {
				
				//System.out.println("Successfully deleted Node: " + removedNode.key);
			}
			
	    }
		
		// Generating inorder traversal output for Gradescope evaluation
		inOrderResult = "";
		System.out.println(bstHeight(bstRoot));
		inOrder(bstRoot);
		return inOrderResult.trim();
		
	}
	
	// Helper function to generate search result after Search operation
	public String searchOperationInBST(int[] searchelementsarray) {
		
		boolean isElementInBST = false; 
		searchResult = "";
		
		for (int i = 0; i < searchelementsarray.length; i++) {
			
			isElementInBST = false; 
			if(search(bstRoot, searchelementsarray[i]) != null) 
				isElementInBST = true;
				
			searchResult = searchResult + isElementInBST + " ";
	    }
		
		return searchResult.trim();
		
	}
	
    
	/**
	 * Given the binary search tree and a key
     * Insert a new node with given key in the BST
	 */
	public void insert(Node node, int key)
	{
		/*** *** Write YOUR CODE HERE *** ***/ 
		// You can add additional methods if you need any
		node = insertRecur(node, key);
        
	    
	}
	public  Node insertRecur(Node root, int key) { 
        //tree is empty
      if (root == null) { 
          root = newNode(key); 
          return root; 
      } 
      //traverse the tree
      if (key < root.key)
          root.left = insertRecur(root.left, key); 
      else if (key > root.key)
          root.right = insertRecur(root.right, key); 
        // return "pointer"
      return root; 
  } 
	 
	
	/**
     * Given the binary search tree and a key
     * Deletes the key and return the deleted node
	 */
	public Node delete(int value)
	{
		/*** *** Write YOUR CODE HERE *** ***/ 
		// You can add additional methods if you need any
		bstRoot = deleteRecur(bstRoot, value);
		return null;
	    
	}
	Node deleteRecur(Node root, int key) {
		if (root == null) 
			return root; 
		   
        //traversing
        if (key < root.key) 
            root.left = deleteRecur(root.left, key); 
        else if (key > root.key) 
            root.right = deleteRecur(root.right, key); 
        else  { 
            // node contains only one child
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
   
            root.key = minValue(root.right);
            
            root.right = deleteRecur(root.right, root.key); 
        } 
        return root;
	}
	//method to find minvalue of node leafs if there are two
	int minValue(Node root)  { 
        
        int minval = root.key; 
        
        while (root.left != null)  { 
            minval = root.left.key; 
            root = root.left; 
        } 
        return minval; 
    } 
	
	/**
     * Given the binary search tree and a key
     * Search the given key in BST
     * return null if key is not available or return the root if key is present
	 */
	public Node search(Node root, int key)
	{
		root = searchrecur(root,key);
		/*** *** Write YOUR CODE HERE *** ***/ 
		// You can add additional methods if you need any
		if( root!= null)
			return root;
		else return null;
		
	}
	Node searchrecur(Node root, int key)  { 
        // Base Cases: root is null or key is present at root 
        if (root==null || root.key==key) 
            return root; 
        // val is greater than root's key 
        if (root.key > key) 
            return searchrecur(root.left, key); 
        // val is less than root's key 
        return searchrecur(root.right, key); 
    } 
	
	
}