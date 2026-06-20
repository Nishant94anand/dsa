package com.nishant.dsa.stacks;

import java.util.List;
import java.util.Stack;

/**
 *
 * DSA Topic - Sorting a Stack
 *
 * 📘 Overview:
 * Given a stack containing unsorted integers, sort the stack using only
 * stack operations and an additional temporary stack.
 *
 * The smallest element should appear at the bottom and the largest element
 * should appear at the top of the resulting stack.
 *
 * 🧩 Example:
 *
 * Original Stack:
 *
 * Top
 * 1
 * 2
 * 5
 * 4
 * 3
 * Bottom
 *
 * After Sorting:
 *
 * Top
 * 5
 * 4
 * 3
 * 2
 * 1
 * Bottom
 *
 * ⚙️ Approach:
 *
 * Maintain a second stack called sortedStack.
 *
 * For every element popped from originalStack:
 *
 * 1. Remove the element.
 * 2. Move larger elements from sortedStack back to originalStack.
 * 3. Insert the current element into its correct position.
 * 4. Continue until originalStack becomes empty.
 *
 * This is conceptually similar to Insertion Sort.
 *
 * 🧩 Example:
 *
 * Original:
 * [3, 4, 5, 2, 1]
 *
 * Process 3:
 * Sorted = [3]
 *
 * Process 4:
 * Sorted = [3, 4]
 *
 * Process 5:
 * Sorted = [3, 4, 5]
 *
 * Process 2:
 *
 * Move:
 * 5 -> Original
 * 4 -> Original
 * 3 -> Original
 *
 * Insert 2
 *
 * Sorted = [2]
 *
 * Continue until all elements are processed.
 *
 * Final:
 *
 * [1, 2, 3, 4, 5]
 *
 * 🧮 Complexity Analysis:
 *
 * Time  : O(N²)
 * Space : O(N)
 *
 * Why O(N²)?
 *
 * For each element, we may need to move multiple elements
 * between the two stacks.
 *
 * 🧠 Key Insights:
 *
 * - Very similar to Insertion Sort.
 * - Uses only stack operations.
 * - Demonstrates how an auxiliary stack can be used to maintain ordering.
 * - Frequently asked stack interview problem.
 *
 * 🔍 Related Topics:
 * Stack, Insertion Sort, Auxiliary Stack, Sorting
 *
 * Author: Nishant Anand
 * Repository: DSA Learning
 */
public class SortingAStack {

	/**
	 * Driver method.
	 *
	 * Creates an unsorted stack and sorts it using only stack operations.
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {

		Stack<Integer> originalStack = new Stack<Integer>();

		for (int num : List.of(3, 4, 5, 2, 1)) {
			originalStack.push(num);
		}

		System.out.println("Original: " + originalStack);

		Stack<Integer> sortedStack = sortStack(originalStack);

		System.out.println("Sorted  : " + sortedStack);
	}

	/**
	 * Sorts a stack using an auxiliary stack.
	 *
	 * Strategy:
	 *
	 * Keep sortedStack sorted at all times.
	 *
	 * Whenever a new element arrives:
	 *
	 * - Move larger elements back to originalStack.
	 * - Insert the current element.
	 * - Continue processing.
	 *
	 * @param originalStack Stack to be sorted
	 *
	 * @return Sorted stack
	 */
	private static Stack<Integer> sortStack(Stack<Integer> originalStack) {

		/*
		 * This stack always remains sorted.
		 */
		Stack<Integer> sortedStack = new Stack<>();

		while (!originalStack.isEmpty()) {

			/*
			 * Remove next element from the original stack.
			 */
			int originalNum = originalStack.pop();

			/*
			 * Move larger elements back to the original stack
			 * until the correct insertion position is found.
			 *
			 * Similar to shifting elements in Insertion Sort.
			 */
			while (!sortedStack.isEmpty()
					&& sortedStack.peek() > originalNum) {

				originalStack.push(sortedStack.pop());
			}

			/*
			 * Insert element into its correct position.
			 */
			sortedStack.push(originalNum);
		}

		return sortedStack;
	}
}