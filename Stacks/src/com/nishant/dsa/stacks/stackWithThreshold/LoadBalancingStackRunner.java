package com.nishant.dsa.stacks.stackWithThreshold;

/**
 *
 * DSA Topic - Stack with Threshold (Load Balancing Stack)
 *
 * 📘 Overview:
 *
 * Driver class used to demonstrate the working of LoadBalancingStack.
 *
 * A LoadBalancingStack behaves exactly like a normal stack from the consumer's
 * perspective, but internally maintains multiple stacks.
 *
 * Whenever the active stack reaches the configured threshold, a new stack is
 * automatically created.
 *
 * Similarly, when an active stack becomes empty during pop operations, it is
 * automatically removed.
 *
 * 🧩 Test Configuration:
 *
 * Threshold:
 * 10 (default)
 *
 * Elements Inserted:
 * 1 to 100
 *
 * Expected Internal Structure:
 *
 * Stack #1  -> [1 ... 10]
 * Stack #2  -> [11 ... 20]
 * ...
 * Stack #10 -> [91 ... 100]
 *
 * ⚙️ Demonstration Flow:
 *
 * Create Stack
 *      ↓
 * Verify Initial State
 *      ↓
 * Insert 100 Elements
 *      ↓
 * Observe Creation of New Internal Stacks
 *      ↓
 * Pop All Elements
 *      ↓
 * Observe Automatic Removal of Empty Stacks
 *
 * 🧠 Key Insights:
 *
 * - Consumer interacts with a single stack abstraction.
 * - Internal stack creation is completely transparent.
 * - Threshold prevents any individual stack from becoming too large.
 * - Demonstrates composition of data structures.
 * - Verifies correctness of push(), pop(), size() and isEmpty().
 *
 * 🔍 Related Topics:
 *
 * Stack, Set Of Stacks, Stack Of Plates, Composition, Load Balancing
 *
 * Author: Nishant Anand
 * Repository: DSA Learning
 */
public class LoadBalancingStackRunner {

	/**
	 * Demonstrates LoadBalancingStack operations.
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {

		LoadBalancingStack stack = new LoadBalancingStack();

		int max = 100;

		/*
		 * Verify initial state of the stack before any insertions.
		 */
		System.out.println("==> IsEmpty: " + stack.isEmpty());
		System.out.println("==> Size: " + stack.size());
		System.out.println("\n==> Initial Stack: " + stack);

		/*
		 * Populate the stack with values from 1 to 100.
		 *
		 * This demonstrates:
		 * - Automatic stack creation
		 * - Threshold enforcement
		 * - Size growth
		 */
		System.out.println(
				"\n=============== Populating the Stack ===============\n");

		for (int i = 1; i <= max; ++i) {

			System.out.println("\n\n==> Inserting " + i);

			stack.push(i);

			System.out.println("==> IsEmpty: " + stack.isEmpty());
			System.out.println("==> Size: " + stack.size());

			System.out.println("\n==> Stack: " + stack);
		}

		System.out.println(
				"\n====================================================\n");

		/*
		 * Remove all elements from the stack.
		 *
		 * This demonstrates:
		 * - LIFO behaviour
		 * - Automatic stack cleanup
		 * - Correct size reduction
		 */
		System.out.println(
				"\n=============== Popping the Stack ===============\n");

		for (int i = max; i >= 1; --i) {

			System.out.println("==> Popping " + i);

			System.out.println("==> Popped " + stack.pop());

			System.out.println("==> IsEmpty: " + stack.isEmpty());
			System.out.println("==> Size: " + stack.size());

			System.out.println("\n==> Stack: " + stack);
		}

		System.out.println(
				"\n====================================================\n");
	}
}