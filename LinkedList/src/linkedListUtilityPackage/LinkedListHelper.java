package linkedListUtilityPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedListHelper {
	
	public static <T> SinglyLinkedListNode<T> createSinglyLinkedList(List<T> list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		
		SinglyLinkedListNode<T> rootNode = null;
		SinglyLinkedListNode<T> prev = null;
		
		for (T value : list) {
			SinglyLinkedListNode<T> node = new SinglyLinkedListNode<>(value);
			
			if (rootNode == null) {
				rootNode = node;
			} else {
				prev.next = node;
			}
			
			prev = node;
		}
		
		return rootNode;
	}
	
	public static SinglyLinkedListNode<Integer> createIntegerSinglyLinkedListFromInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("==> Enter Linked List (e.g., 12 8 7): ");
		SinglyLinkedListNode<Integer> linkedList = null;
		String line = sc.nextLine();

		if (line.length() > 0) {
			String[] ll1String = line.split(" ");
			List<Integer> ll1List = new ArrayList<>();

			for (String str : ll1String) {
				ll1List.add(Integer.parseInt(str));
			}

			linkedList = createSinglyLinkedList(ll1List);
		}

		System.out.println("==> Linked List: " + linkedList);
		
		return linkedList;
	}
	
	public static <T> DoublyLinkedListNode<T> createDoublyLinkedList(List<T> list) {
		if (list == null || list.size() == 0) {
			return null;
		}
		
		DoublyLinkedListNode<T> rootNode = null;
		DoublyLinkedListNode<T> prev = null;
		
		for (T value : list) {
			DoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(value);
			
			if (rootNode == null) {
				rootNode = node;
			} else {
				prev.next = node;
				node.prev = prev;
			}
			
			prev = node;
		}
		
		return rootNode;
	}
	
	public static DoublyLinkedListNode<Integer> createIntegerDoublyLinkedListFromInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("==> Enter Linked List (e.g., 12 8 7): ");
		DoublyLinkedListNode<Integer> linkedList = null;
		String line = sc.nextLine();

		if (line.length() > 0) {
			String[] ll1String = line.split(" ");
			List<Integer> ll1List = new ArrayList<>();

			for (String str : ll1String) {
				ll1List.add(Integer.parseInt(str));
			}

			linkedList = createDoublyLinkedList(ll1List);
		}

		System.out.println("==> Linked List: " + linkedList);
		
		return linkedList;
	}

}
