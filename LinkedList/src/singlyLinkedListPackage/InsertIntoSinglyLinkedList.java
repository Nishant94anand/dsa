package singlyLinkedListPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import linkedListUtilityPackage.LinkedListHelper;
import linkedListUtilityPackage.SinglyLinkedListNode;

/**
 * DSA Topic - Insertion Operations in Singly Linked List
 * ----------------------------------------
 * 📘 Overview:
 * Demonstrates different insertion operations in a singly linked list.
 * The program supports inserting nodes at the beginning, at the end,
 * or at any given index in the list.
 *
 * 🧩 Example:
 * Input  : 10 20 30
 * Operation: Insert 15 at index 1
 * Output : 10 → 15 → 20 → 30
 *
 * ⚙️ Approach:
 * - Parse input into a list and create a singly linked list.
 * - Use menu-driven options to perform insertion operations.
 * - Insert at head, tail, or specific index by adjusting next pointers.
 *
 * 🧮 Complexity Analysis:
 * Insert at Head : O(1)
 * Insert at Tail : O(n)
 * Insert at Index: O(n)
 *
 * 🧠 Key Insights:
 * - Reinforces understanding of pointer manipulation in linked lists.
 * - Highlights traversal logic and handling of edge cases.
 *
 * 🔍 Related Topics:
 * Linked Lists, Pointer Manipulation, Iterative Traversal
 *
 * ----------------------------------------
 * Author: Nishant Anand
 * Repository: DSA-Java-Playground
 */
public class InsertIntoSinglyLinkedList {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Welcome to Linked List Insertion =====");
        System.out.print("Enter elements of Int Linked List space separated: ");

        // Parse user input into integer list
        List<Integer> initialList = new ArrayList<>();
        String initialString = sc.nextLine();
        String[] initial = initialString.split(" ");

        for (String num : initial) {
            if (!num.isBlank()) {
                initialList.add(Integer.parseInt(num));
            }
        }

        // Create initial linked list
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
     * @param rootNode head node of the linked list
     */
    private static void print(SinglyLinkedListNode<Integer> rootNode) {
        System.out.println("\n==> Final LinkedList: " + rootNode + "\n");
    }

    /**
     * Inserts a new node into the linked list at the specified position.
     *
     * ⚙️ Logic:
     * - Handles three cases:
     *   1. Empty list → Creates new node if index == 0
     *   2. Insert at head → Prepend new node
     *   3. Insert at tail or index → Traverse until (index - 1)
     * - Uses {@code insertLast} flag to control tail insertion.
     *
     * 🧠 Edge Cases:
     * - Negative index → treated as 0
     * - Insertion beyond tail → adds at the end
     * - Empty list with invalid index → throws Exception
     *
     * @param rootNode   head of the linked list
     * @param index      index at which new node should be inserted
     * @param value      value to insert
     * @param insertLast if true, node is appended regardless of index
     * @return updated head node of the linked list
     * @throws Exception if insertion index is invalid for an empty list
     */
    private static SinglyLinkedListNode<Integer> insertIntoSinglyLinkedList(
            SinglyLinkedListNode<Integer> rootNode,
            int index,
            int value,
            boolean insertLast) throws Exception {

        // Treat negative index as 0 for safety
        if (index < 0) index = 0;

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

        // Traverse to the desired position
        SinglyLinkedListNode<Integer> curr = rootNode;
        int currIndex = 0;

        // If insertLast is true → go till end
        while (insertLast ? curr.next != null : currIndex < index - 1) {
            curr = curr.next;
            currIndex++;

            // Stop if reached tail before target index
            if (curr.next == null && currIndex < index - 1) {
                break;
            }
        }

        // Create new node and adjust pointers
        SinglyLinkedListNode<Integer> newNode = new SinglyLinkedListNode<>(value, curr.next);
        curr.next = newNode;

        return rootNode;
    }
}
