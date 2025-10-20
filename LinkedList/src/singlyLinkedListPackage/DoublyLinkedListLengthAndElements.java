package singlyLinkedListPackage;

import java.util.Scanner;

import linkedListUtilityPackage.DoublyLinkedListNode;
import linkedListUtilityPackage.LinkedListHelper;

public class DoublyLinkedListLengthAndElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListNode<Integer> list = LinkedListHelper.createIntegerDoublyLinkedListFromInput();
		int length = getLength(list);
		System.out.println("Length: " + length);
		System.out.println(list);
		
		System.out.println("Element to find: ");
		Scanner sc = new Scanner(System.in);
		int elementToFind = sc.nextInt();
		System.out.println("First Occurence: " + getFirstOccurenceIndex(list, elementToFind));
		
		System.out.println("Index to get: ");
		int indexToGet = sc.nextInt();		
		System.out.println("Element at index: " + getElementAtIndex(list, indexToGet));
		
		

	}

	private static int getLength(DoublyLinkedListNode<Integer> list) {
		int length = 0;

		DoublyLinkedListNode<Integer> curr = list;

		while (curr != null) {
			length++;
			curr = curr.next;
		}

		return length;

	}
	
	private static Integer getFirstOccurenceIndex(DoublyLinkedListNode<Integer> list, int element) {
		if (list == null) {
			return null;
		}
		
		DoublyLinkedListNode<Integer> curr = list;
		int index = 0;
		
		while (curr != null) {
			if (curr.value == element) {
				return index;
			}
			
			curr = curr.next;
			index++;
		}
		
		return null;
		
	}
	
	private static Integer getElementAtIndex(DoublyLinkedListNode<Integer> list, int index) {
		if (list == null) {
			return null;
		}
		
		DoublyLinkedListNode<Integer> curr = list;
		int currIndex = 0;
		
		while (curr != null) {
			if (currIndex == index) {
				return curr.value;
			}
			
			curr = curr.next;
			currIndex++;
		}
		
		return null;
		
	}

}
