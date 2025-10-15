package singlyLinkedListPackage;

import java.util.Arrays;

import linkedListUtilityPackage.LinkedListHelper;
import linkedListUtilityPackage.SinglyLinkedListNode;

public class SinglyLinkedListLength {

	public static void main(String[] args) {
		SinglyLinkedListNode<Integer> rootNode = LinkedListHelper.createSinglyLinkedList(Arrays.asList(1,2,3));
		System.out.println(rootNode);
		
		int length = lengthOfSinglyLinkedList(rootNode);
		System.out.printf("Length: %d", length);
	}
	
	private static int lengthOfSinglyLinkedList(SinglyLinkedListNode<Integer> rootNode) {
		int length = 0;
		
		SinglyLinkedListNode<Integer> curr = rootNode;
		
		while (curr != null) {
			length++;
			curr = curr.next;
		}
		
		return length;
	}

}
