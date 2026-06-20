package com.nishant.dsa.stacks.getMinimum;

import java.util.List;

/**
 *
 * DSA Topic - Stack with Get Minimum
 *
 * 📘 Overview: Driver class used to demonstrate the working of
 * StackWithGetMinimum.
 *
 * The runner pushes a sequence of integers into the stack and then repeatedly:
 *
 * 1. Prints the current stack state 2. Prints the current minimum element 3.
 * Pops the top element
 *
 * This helps visualize how the auxiliary minStack changes over time and how
 * O(1) minimum lookup is maintained.
 *
 * 🧩 Input Sequence:
 *
 * [100, 2, 50, 2, 3, 4, 1, 10, 7, 3]
 *
 * Expected Minimum Progression:
 *
 * Push 100 → Min = 100 Push 2 → Min = 2 Push 50 → Min = 2 Push 2 → Min = 2 Push
 * 1 → Min = 1
 *
 * After popping 1: Min becomes 2
 *
 * After popping second 2: Min remains 2
 *
 * After popping first 2: Min becomes 100
 *
 * ⚙️ Demonstration Flow:
 *
 * Push Elements ↓ Print Stack ↓ Print Minimum ↓ Pop Element ↓ Repeat Until
 * Empty
 *
 * 🧠 Key Insights:
 *
 * - Duplicate minimum values must be stored in minStack. - Minimum lookup
 * remains O(1) throughout execution. - Removal of a minimum value updates
 * minStack automatically. - Great visualization of the auxiliary stack
 * technique.
 *
 * 🔍 Related Topics: Stack, Auxiliary Stack, Design Problems, O(1) Data
 * Structures
 *
 * Author: Nishant Anand Repository: DSA Learning
 */
public class StackWithGetMinimumRunner {

	/**
	 * Demonstrates StackWithGetMinimum operations.
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {

		StackWithGetMinimum stk = new StackWithGetMinimum();

		/*
		 * Push a mixture of values including duplicate minimums.
		 *
		 * Duplicate minimums are important because they verify that minStack correctly
		 * tracks multiple occurrences.
		 */
		for (Integer num : List.of(100, 2, 50, 2, 3, 4, 1, 10, 7, 3)) {

			stk.push(num);
		}

		/*
		 * Continuously print the current state and remove elements until the stack
		 * becomes empty.
		 */
		while (!stk.isEmpty()) {

			System.out.println("\n==============================================================\n");

			System.out.println("Stack:");
			System.out.println(stk);

			System.out.println("Get Minimum: " + stk.getMinimum());

			System.out.println("Popping now: " + stk.pop());

			System.out.println("\n==============================================================\n");
		}
	}
}