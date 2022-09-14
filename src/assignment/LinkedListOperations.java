package assignment;

import assignment.DoublyLinkedList.Node;

public class LinkedListOperations {
	
	/* 
	 * Function to reverse the Doubly linked list 
	 * Details of the Doubly Linked List are in the file DoublyLinkedList.java
	 * Reverse the provided list
    */ 
	public void reverseLinkedList(DoublyLinkedList list)
	{
		
		
		DoublyLinkedList reverse = new DoublyLinkedList() ;
		reverse.head = list.tail;
		reverse.tail = reverse.head;
		//reverse.head.previous = null;
		//reverse.addNode(list.tail.data);
		//reverse.head = list.tail;
		Node temp = list.tail;
		while(temp != list.head) {
			temp = temp.previous;
			int data = temp.data;
			reverse.addNode(data);
		}
		//reverse.head = list.tail;
		reverse.head.previous = null;
		reverse.tail.next = null;
		
		list.head = reverse.head;
		
		
        
    }
	
	
	/*
	 * Function to check if list is palindrome or not
	 * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar.
	 * Return the boolean result of your implementation
	 */
	public boolean isPalindrome(DoublyLinkedList list)
	{
		
		Node beginning = list.head;
		
		if (beginning == null)
    	return true;
 
	    
	    Node end = beginning;
	    while (end.next != null)
			end = end.next;
	 
	    while (beginning != end)
	    {
	        if (beginning.data != end.data)
	            return false;
	 
			beginning = beginning.next;
	        end = end.previous;
	    }
	 
	    return true;
	}

}
