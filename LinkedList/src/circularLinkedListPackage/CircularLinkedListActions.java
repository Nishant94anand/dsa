package circularLinkedListPackage;

import java.util.Scanner;
import linkedListUtilityPackage.LinkedListHelper;
import linkedListUtilityPackage.SinglyLinkedListNode;

/**
 * DSA Topic - Circular Linked List (Insert & Delete Operations)
 * -------------------------------------------------------------
 * 📘 Overview:
 * This class demonstrates insertion and deletion operations in a
 * Circular Singly Linked List. Unlike a normal linked list, the
 * last node points back to the head, forming a ring structure.
 *
 * Supported Actions:
 *  - Insert at Head
 *  - Insert at Tail
 *  - Delete at Head
 *  - Delete at Tail
 *
 * 🧩 Example:
 * Input  : 10 20 30 (Circular)
 * InsertAtHead(5)
 * InsertAtTail(99)
 * Output : 5 -> 10 -> 20 -> 30 -> 99 -> (loops back to 5)
 *
 * ⚙️ Approach:
 *  - Use helper function `findTail()` to reach the last node
 *  - Adjust pointers depending on operation
 *  - Maintain circular nature: tail.next should always point to head
 *
 * 🧮 Complexity Analysis:
 * Time  : O(n) for insert/delete (tail traversal required)
 * Space : O(1)
 *
 * 🧠 Key Insights:
 *  - Circular list ensures no NULL exists in .next of any node
 *  - Be careful updating both head and tail in operations
 *
 * 🔍 Related Topics:
 * Linked List, Circular Linked List, Pointers
 *
 * -------------------------------------------------------------
 * Author: Nishant Anand
 * Repository: DSA-Java-Playground
 */
public class CircularLinkedListActions {

	public static void main(String[] args) {

		System.out.println("\n===== Welcome to Insert and Delete Actions of Circular Linked List =====");
		System.out.println("==> Let's first create the Circular Linked List.");

		SinglyLinkedListNode<Integer> head = LinkedListHelper.createIntegerCircularLinkedListFromInput();
		System.out.println("\nGreat!!\n");

		int action = 1;
		Scanner sc = new Scanner(System.in);

		while (action != 5) {
			System.out.println("\n==> Choose the action to perform: ");
			System.out.println("1. Insert at Head");
			System.out.println("2. Insert at Tail");
			System.out.println("3. Delete at Head");
			System.out.println("4. Delete at Tail");
			System.out.println("5. Exit");
			System.out.print("\n==> Action: ");

			action = sc.nextInt();

			switch (action) {
				case 1 -> {
					System.out.print("\n=> Value to insert: ");
					head = insertAtHead(head, sc.nextInt());
				}
				case 2 -> {
					System.out.print("\n=> Value to insert: ");
					head = insertAtTail(head, sc.nextInt());
				}
				case 3 -> head = deleteAtHead(head);
				case 4 -> head = deleteAtTail(head);
				case 5 -> System.out.println("Exiting...");
				default -> {
					System.out.println("Invalid input. Exiting...");
					action = 5;
				}
			}

			System.out.println("\n===> New List: ");
			LinkedListHelper.printCircularLinkedList(head);
		}

		sc.close();
	}

	/**
	 * Inserts a node at the head of the circular linked list.
	 */
	private static SinglyLinkedListNode<Integer> insertAtHead(SinglyLinkedListNode<Integer> head, int value) {
		SinglyLinkedListNode<Integer> newNode = new SinglyLinkedListNode<>(value);

		// Case: first node in list
		if (head == null) {
			newNode.next = newNode; // circular link
			return newNode;
		}

		SinglyLinkedListNode<Integer> tail = findTail(head);

		newNode.next = head;
		tail.next = newNode;   // maintain circular nature

		return newNode;        // update head
	}

	/**
	 * Inserts a node at the tail of the circular linked list.
	 */
	private static SinglyLinkedListNode<Integer> insertAtTail(SinglyLinkedListNode<Integer> head, int value) {
		SinglyLinkedListNode<Integer> newNode = new SinglyLinkedListNode<>(value);

		if (head == null) {
			newNode.next = newNode;
			return newNode;
		}

		SinglyLinkedListNode<Integer> tail = findTail(head);

		tail.next = newNode;
		newNode.next = head;

		return head;
	}

	/**
	 * Deletes the head node of the circular linked list.
	 */
	private static SinglyLinkedListNode<Integer> deleteAtHead(SinglyLinkedListNode<Integer> head) {
		if (head == null || head.next == head) {
			return null;
		}

		SinglyLinkedListNode<Integer> tail = findTail(head);

		SinglyLinkedListNode<Integer> newHead = head.next;
		tail.next = newHead;

		return newHead;
	}

	/**
	 * Deletes the tail node of the circular linked list.
	 */
	private static SinglyLinkedListNode<Integer> deleteAtTail(SinglyLinkedListNode<Integer> head) {
		if (head == null || head.next == head) {
			return null;
		}

		SinglyLinkedListNode<Integer> curr = head;

		while (curr.next.next != head) {
			curr = curr.next;
		}

		curr.next = head; // remove last node
		return head;
	}

	/**
	 * Utility function: Returns tail node (whose next points to head).
	 */
	private static SinglyLinkedListNode<Integer> findTail(SinglyLinkedListNode<Integer> head) {
		SinglyLinkedListNode<Integer> curr = head;

		while (curr.next != head) {
			curr = curr.next;
		}

		return curr;
	}
}
