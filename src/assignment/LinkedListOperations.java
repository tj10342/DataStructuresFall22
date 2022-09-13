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
		/*** *** Write YOUR CODE HERE *** ***/
		
        
    }
	
	
	/*
	 * Function to check if list is palindrome or not
	 * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar.
	 * Return the boolean result of your implementation
	 */
	public boolean isPalindrome(DoublyLinkedList list)
	{
		boolean bool =true;
		Node beginning = list.head;
		Node end = list.tail;
		int count =0;
		/*** *** Write YOUR CODE HERE *** ***/
		if (list.size == (1 | 2)) {
			bool = false;
			
		}
		else if(list.size >2) {
			while (beginning.next != null) {
				
				
			}
		
			
		
		
		}
	 
	    return bool;
	}

}
