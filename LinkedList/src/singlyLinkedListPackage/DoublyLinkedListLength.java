package singlyLinkedListPackage;

import linkedListUtilityPackage.DoublyLinkedListNode;
import linkedListUtilityPackage.LinkedListHelper;

public class DoublyLinkedListLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListNode<Integer> list = LinkedListHelper.createIntegerDoublyLinkedListFromInput();
		int length = getLength(list);
		System.out.println("Length: " + length);
		System.out.println(list);

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

}
