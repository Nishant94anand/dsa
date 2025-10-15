package singlyLinkedListPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import linkedListUtilityPackage.LinkedListHelper;
import linkedListUtilityPackage.SinglyLinkedListNode;

/**
 * Demonstrates insertion operations in a Singly Linked List.
 *
 * <p><b>Supported Operations:</b>
 * <ul>
 *   <li>Insert at the beginning</li>
 *   <li>Insert at the end</li>
 *   <li>Insert at a specific index</li>
 * </ul>
 *
 * <p>The program accepts user input for initial elements and then performs insertion
 * operations interactively via console options.
 *
 * <p><b>Example:</b><br>
 * Input List: 10 20 30<br>
 * Insert 15 at index 1 → Output: 10 → 15 → 20 → 30
 *
 * <p><b>Complexity:</b>
 * <ul>
 *   <li>Insert at head → O(1)</li>
 *   <li>Insert at tail or index → O(n)</li>
 * </ul>
 *
 * <p><b>Author:</b> Nishant Anand
 */
public class InsertIntoSinglyLinkedList {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Welcome to Linked List Insertion =====");
        System.out.print("Enter elements of Int Linked List space separated: ");

        // Parse input line into integer list
        List<Integer> initialList = new ArrayList<>();
        String initialString = sc.nextLine();
        String[] initial = initialString.split(" ");

        for (String num : initial) {
            if (!num.isBlank()) {
                initialList.add(Integer.parseInt(num));
            }
        }

        // Create linked list from input
        SinglyLinkedListNode<Integer> rootNode = LinkedListHelper.createSinglyLinkedList(initialList);
        System.out.printf("\nInitial LinkedList: %s\n\n", rootNode);

        int option;

        // Menu-driven insertion loop
        do {
            System.out.println("Choose the Insert action to be performed now: ");
            System.out.println("#1 : Insert at the beginning");
            System.out.println("#2 : Insert at the end");
            System.out.println("#3 : Insert at a given index");
            System.out.println("#4 : End");
            System.out.print("\nOption #: ");

            option = sc.nextInt();
            System.out.printf("\n==> Selected Option: %d\n", option);

            int value, index;

            switch (option) {
                case 1:
                    System.out.print("Value: ");
                    value = sc.nextInt();
                    rootNode = insertIntoSinglyLinkedList(rootNode, 0, value, false);
                    print(rootNode);
                    break;

                case 2:
                    System.out.print("Value: ");
                    value = sc.nextInt();
                    rootNode = insertIntoSinglyLinkedList(rootNode, 0, value, true);
                    print(rootNode);
                    break;

                case 3:
                    System.out.print("Value: ");
                    value = sc.nextInt();
                    System.out.print("Index: ");
                    index = sc.nextInt();
                    rootNode = insertIntoSinglyLinkedList(rootNode, index, value, false);
                    print(rootNode);
                    break;

                default:
                    option = 4;
                    System.out.println("\nExiting insertion menu...");
            }

        } while (option != 4);

        sc.close();
        System.out.println("\n===== Good Bye =====\n");
    }

    /**
     * Prints the linked list in its current state.
     *
     * @param rootNode head of the linked list
     */
    private static void print(SinglyLinkedListNode<Integer> rootNode) {
        System.out.println("\n==> Final LinkedList: " + rootNode + "\n");
    }

    /**
     * Inserts a new node with the given value at the specified index (or at the end).
     *
     * <p>If {@code insertLast} is true, the node is appended at the end of the list
     * regardless of the {@code index} value.
     *
     * <p><b>Edge Cases Handled:</b>
     * <ul>
     *   <li>Null head node (empty list)</li>
     *   <li>Negative index (treated as 0)</li>
     *   <li>Insertion beyond the tail (inserts at end)</li>
     * </ul>
     *
     * @param rootNode   the head node of the linked list
     * @param index      target index for insertion (0-based)
     * @param value      value to be inserted
     * @param insertLast true if inserting at the end regardless of index
     * @return updated head node after insertion
     * @throws Exception if insertion index is invalid for an empty list
     */
    private static SinglyLinkedListNode<Integer> insertIntoSinglyLinkedList(
            SinglyLinkedListNode<Integer> rootNode,
            int index,
            int value,
            boolean insertLast) throws Exception {

        // Treat negative index as 0
        if (index < 0) {
            index = 0;
        }

        // Case 1: Empty list
        if (rootNode == null) {
            if (index == 0) {
                return new SinglyLinkedListNode<>(value);
            } else {
                throw new Exception("Invalid insertion index for empty list");
            }
        }

        // Case 2: Insert at head
        if (index == 0 && !insertLast) {
            return new SinglyLinkedListNode<>(value, rootNode);
        }

        // Traverse to the insertion point
        SinglyLinkedListNode<Integer> curr = rootNode;
        int currIndex = 0;

        while (insertLast ? curr.next != null : currIndex < index - 1) {
            curr = curr.next;
            currIndex++;
            if (curr.next == null && currIndex < index - 1) {
                // If index exceeds list length, insert at tail
                break;
            }
        }

        // Create and insert new node
        SinglyLinkedListNode<Integer> newNode = new SinglyLinkedListNode<>(value, curr.next);
        curr.next = newNode;

        return rootNode;
    }
}