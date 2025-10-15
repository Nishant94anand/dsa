package singlyLinkedListPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import linkedListUtilityPackage.LinkedListHelper;
import linkedListUtilityPackage.SinglyLinkedListNode;

/**
 * DSA Topic - Delete Operations in Singly Linked List
 * ----------------------------------------
 * 📘 Overview:
 * Demonstrates various deletion operations in a singly linked list.
 * Supports deletion from the beginning, end, or a specific index.
 *
 * 🧩 Example:
 * Input  : 10 20 30 40
 * Action : Delete index 2
 * Output : 10 → 20 → 40
 *
 * ⚙️ Approach:
 * - Delete from Beginning: Move head pointer to next node.
 * - Delete from End: Traverse to the second-last node and unlink the last.
 * - Delete by Index: Traverse until the previous node and skip the target node.
 * - Handles invalid index and empty list cases gracefully.
 *
 * 🧮 Complexity Analysis:
 * Time  : O(1) for head deletion, O(n) for end/index deletion
 * Space : O(1)
 *
 * 🧠 Key Insights:
 * - Always handle empty list and single-node list separately.
 * - Keep track of both current and previous nodes for index deletion.
 * - Avoid memory leaks by unlinking target nodes cleanly.
 *
 * 🔍 Related Topics:
 * Linked List, Pointers, Deletion Operations
 *
 * ----------------------------------------
 * Author: Nishant Anand
 * Repository: DSA-Java-Playground
 */
public class DeleteFromSinglyLinkedList {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Welcome to Linked List Deletion =====");
        System.out.print("Enter elements of Int Linked List space separated: ");

        // Parse user input into integer list
        List<Integer> initialList = new ArrayList<>();
        String[] initial = sc.nextLine().split(" ");

        for (String num : initial) {
            if (!num.isBlank()) {
                initialList.add(Integer.parseInt(num));
            }
        }

        // Create linked list from user input
        SinglyLinkedListNode<Integer> rootNode = LinkedListHelper.createSinglyLinkedList(initialList);
        System.out.printf("\nInitial LinkedList: %s\n\n", rootNode);

        int option;

        // Menu-driven deletion loop
        do {
            System.out.println("Choose the Delete action to be performed now: ");
            System.out.println("#1 : Delete from the beginning");
            System.out.println("#2 : Delete from the end");
            System.out.println("#3 : Delete from a given index");
            System.out.println("#4 : End");
            System.out.print("\nOption #: ");

            option = sc.nextInt();
            System.out.printf("\n==> Selected Option: %d\n", option);

            switch (option) {
                case 1:
                    rootNode = deleteFromBeginning(rootNode);
                    print(rootNode);
                    break;

                case 2:
                    rootNode = deleteFromEnd(rootNode);
                    print(rootNode);
                    break;

                case 3:
                    System.out.print("Index: ");
                    int index = sc.nextInt();
                    rootNode = deleteFromIndex(rootNode, index);
                    print(rootNode);
                    break;

                default:
                    option = 4;
                    System.out.println("\nExiting deletion menu...");
            }

        } while (option != 4);

        sc.close();
        System.out.println("\n===== Good Bye =====\n");
    }

    /**
     * Deletes the node at a specified index.
     *
     * @param rootNode head node of the linked list
     * @param index    index of node to delete (0-based)
     * @return updated head node after deletion
     * @throws Exception if index exceeds list length
     */
    private static SinglyLinkedListNode<Integer> deleteFromIndex(
            SinglyLinkedListNode<Integer> rootNode, int index) throws Exception {

        if (index == 0) {
            return deleteFromBeginning(rootNode);
        }

        SinglyLinkedListNode<Integer> curr = rootNode;
        SinglyLinkedListNode<Integer> prev = null;
        int location = 0;

        // Traverse to node at given index
        while (curr != null && location < index) {
            prev = curr;
            curr = curr.next;
            location++;
        }

        if (curr == null) {
            throw new Exception("Invalid Index: Linked List is not that long");
        }

        // Bypass the target node
        prev.next = curr.next;
        curr = null; // Help GC

        return rootNode;
    }

    /**
     * Deletes the head node of the linked list.
     *
     * @param rootNode head node of the list
     * @return updated head after deletion
     */
    private static SinglyLinkedListNode<Integer> deleteFromBeginning(SinglyLinkedListNode<Integer> rootNode) {
        if (rootNode != null) {
            rootNode = rootNode.next;
        }
        return rootNode;
    }

    /**
     * Deletes the last node of the linked list.
     *
     * @param rootNode head node of the list
     * @return updated head after deletion
     */
    private static SinglyLinkedListNode<Integer> deleteFromEnd(SinglyLinkedListNode<Integer> rootNode) {
        if (rootNode == null) {
            return null;
        }

        // If single node
        if (rootNode.next == null) {
            return null;
        }

        // Traverse to second-last node
        SinglyLinkedListNode<Integer> curr = rootNode;
        SinglyLinkedListNode<Integer> nextNode = rootNode.next;

        while (nextNode.next != null) {
            curr = nextNode;
            nextNode = nextNode.next;
        }

        // Unlink last node
        curr.next = null;
        return rootNode;
    }

    /**
     * Prints the linked list in current state.
     *
     * @param rootNode head node of the list
     */
    private static void print(SinglyLinkedListNode<Integer> rootNode) {
        System.out.println("\n==> Final LinkedList: " + rootNode + "\n");
    }
}