/**
 * DSA Topic - Doubly Linked List: Insert and Delete Operations
 * ----------------------------------------
 * 📘 Overview:
 * This class demonstrates insertion and deletion operations in a **Doubly Linked List**.
 * It provides an interactive console interface for performing the following:
 * - Insert at Head / Tail / Specific Index
 * - Delete from Head / Tail / Specific Index
 * - Delete First Matching Element
 *
 * 🧩 Example:
 * Input  : 10 20 30 40
 * Action : Insert 25 at index 2
 * Output : 10 <-> 20 <-> 25 <-> 30 <-> 40
 *
 * ⚙️ Approach:
 * - Each operation is implemented as a standalone method that takes `head` and returns updated `head`.
 * - Node connections (`prev`, `next`) are carefully maintained during insertions and deletions.
 * - Index-based operations perform linear traversal till the target position.
 *
 * 🧮 Complexity Analysis:
 * - Insert/Delete at Head: O(1)
 * - Insert/Delete at Tail or Index: O(n)
 * - Space Complexity: O(1)
 *
 * 🧠 Key Insights:
 * - Always update both `next` and `prev` links when modifying pointers.
 * - Handle edge cases: empty list, head/tail updates, invalid index.
 * - Return the new head reference for any operation that may modify the list start.
 *
 * 🔍 Related Topics:
 * - Linked List
 * - Data Structures
 * - Pointers and Memory Management
 *
 * ----------------------------------------
 * Author: Nishant Anand
 * Repository: DSA-Java-Playground
 */

package doublyLinkedListPackage;

import java.util.Scanner;
import linkedListUtilityPackage.DoublyLinkedListNode;
import linkedListUtilityPackage.LinkedListHelper;

public class DoublyLinkedListInsertAndDelete {

    public static void main(String[] args) throws Exception {
        System.out.println("\n===== Welcome to Insert and Delete Actions of Doubly Linked List =====");
        System.out.println("==> Let's first create the Doubly Linked List.");

        DoublyLinkedListNode<Integer> head = LinkedListHelper.createIntegerDoublyLinkedListFromInput();
        System.out.println("\nGreat!!\n");

        int action = 1;
        Scanner sc = new Scanner(System.in);

        while (action != 8) {
            System.out.println("\n==> Choose the action to perform: ");
            System.out.println("1. Insert at Head");
            System.out.println("2. Insert at Tail");
            System.out.println("3. Insert at Index");
            System.out.println("4. Delete at Head");
            System.out.println("5. Delete at Tail");
            System.out.println("6. Delete at Index");
            System.out.println("7. Delete First Matching Element");
            System.out.println("8. Exit");
            System.out.print("\n==> Action: ");

            action = sc.nextInt();
            int val;

            switch (action) {
                case 1 -> {
                    System.out.println("\n=> Value to insert: ");
                    head = insertAtHead(head, sc.nextInt());
                }
                case 2 -> {
                    System.out.println("\n=> Value to insert: ");
                    head = insertAtTail(head, sc.nextInt());
                }
                case 3 -> {
                    System.out.println("\n==> Value to insert: ");
                    val = sc.nextInt();
                    System.out.println("==> Index: ");
                    int insertIndex = sc.nextInt();
                    head = insertAtIndex(head, insertIndex, val);
                }
                case 4 -> head = deleteAtHead(head);
                case 5 -> head = deleteAtTail(head);
                case 6 -> {
                    System.out.println("\n==> Index to delete: ");
                    head = deleteAtIndex(head, sc.nextInt());
                }
                case 7 -> {
                    System.out.println("\n==> Value to delete: ");
                    head = deleteFirstInstance(head, sc.nextInt());
                }
                case 8 -> System.out.println("Exiting...");
                default -> {
                    System.out.println("Invalid input. Exiting...");
                    action = 8;
                }
            }

            System.out.println("\n===> New List: " + head + "\n");
        }

        sc.close();
    }

    // ----------------------------------------
    // 💠 INSERTION OPERATIONS
    // ----------------------------------------

    /** Insert a new node at the head of the doubly linked list */
    private static DoublyLinkedListNode<Integer> insertAtHead(DoublyLinkedListNode<Integer> head, int value) {
        DoublyLinkedListNode<Integer> node = new DoublyLinkedListNode<>(value);
        node.next = head;

        if (head != null) {
            head.prev = node;
        }

        return node; // New head
    }

    /** Insert a new node at the tail of the doubly linked list */
    private static DoublyLinkedListNode<Integer> insertAtTail(DoublyLinkedListNode<Integer> head, int value) {
        if (head == null)
            return insertAtHead(head, value);

        DoublyLinkedListNode<Integer> curr = head;
        while (curr.next != null)
            curr = curr.next;

        DoublyLinkedListNode<Integer> node = new DoublyLinkedListNode<>(value);
        curr.next = node;
        node.prev = curr;

        return head;
    }

    /** Insert a new node at a given index */
    private static DoublyLinkedListNode<Integer> insertAtIndex(DoublyLinkedListNode<Integer> head, int index, int value)
            throws Exception {
        if (index < 0)
            throw new Exception("Invalid index: negative");

        if (index == 0)
            return insertAtHead(head, value);

        if (head == null)
            throw new Exception("Invalid index: empty list");

        DoublyLinkedListNode<Integer> curr = head;
        int currIndex = 0;

        while (currIndex < index - 1) {
            if (curr == null)
                throw new Exception("Invalid index: list shorter than index");
            curr = curr.next;
            currIndex++;
        }

        DoublyLinkedListNode<Integer> node = new DoublyLinkedListNode<>(value);
        node.next = curr.next;
        node.prev = curr;

        if (curr.next != null)
            curr.next.prev = node;

        curr.next = node;
        return head;
    }

    // ----------------------------------------
    // 💠 DELETION OPERATIONS
    // ----------------------------------------

    /** Delete the first node (head) of the list */
    private static DoublyLinkedListNode<Integer> deleteAtHead(DoublyLinkedListNode<Integer> head) {
        if (head == null)
            return null;

        DoublyLinkedListNode<Integer> newHead = head.next;
        if (newHead != null)
            newHead.prev = null;

        return newHead;
    }

    /** Delete the last node (tail) of the list */
    private static DoublyLinkedListNode<Integer> deleteAtTail(DoublyLinkedListNode<Integer> head) throws Exception {
        if (head == null)
            throw new Exception("Invalid - Empty List");

        if (head.next == null)
            return null; // Only one element

        DoublyLinkedListNode<Integer> curr = head;
        while (curr.next != null)
            curr = curr.next;

        curr.prev.next = null;
        return head;
    }

    /** Delete the node at a specific index */
    private static DoublyLinkedListNode<Integer> deleteAtIndex(DoublyLinkedListNode<Integer> head, int index)
            throws Exception {
        if (index < 0)
            throw new Exception("Invalid - negative index");

        if (head == null)
            throw new Exception("Invalid - Empty List");

        if (index == 0)
            return deleteAtHead(head);

        DoublyLinkedListNode<Integer> curr = head;
        int currIndex = 0;

        while (currIndex < index && curr != null) {
            curr = curr.next;
            currIndex++;
        }

        if (curr == null)
            throw new Exception("Invalid index - List is smaller!");

        if (curr.prev != null)
            curr.prev.next = curr.next;

        if (curr.next != null)
            curr.next.prev = curr.prev;

        return head;
    }

    /** Delete the first occurrence of a given value */
    private static DoublyLinkedListNode<Integer> deleteFirstInstance(DoublyLinkedListNode<Integer> head, int value)
            throws Exception {
        if (head == null)
            throw new Exception("Empty List");

        DoublyLinkedListNode<Integer> curr = head;

        while (curr != null) {
            if (curr.value == value) {
                if (curr.prev != null)
                    curr.prev.next = curr.next;
                else
                    head = curr.next; // deleting head

                if (curr.next != null)
                    curr.next.prev = curr.prev;

                return head; // Stop after first match
            }
            curr = curr.next;
        }

        throw new Exception("Item not found");
    }
}