package com.nishant.dsa.stacks.getMinimum;

import java.util.Stack;

/**
 *
 * DSA Topic - Stack with Get Minimum
 *
 * 📘 Overview:
 * Implements a stack that supports retrieving the minimum element in O(1)
 * time along with standard stack operations.
 *
 * The idea is to maintain an additional stack (minStack) which keeps track
 * of the minimum values seen so far.
 *
 * 🧩 Example:
 *
 * Push Sequence:
 * 5, 2, 8, 1, 3
 *
 * Main Stack:
 * [5, 2, 8, 1, 3]
 *
 * Min Stack:
 * [5, 2, 1]
 *
 * Current Minimum:
 * 1
 *
 * After popping 3:
 *
 * Main Stack:
 * [5, 2, 8, 1]
 *
 * Min Stack:
 * [5, 2, 1]
 *
 * Minimum remains:
 * 1
 *
 * After popping 1:
 *
 * Main Stack:
 * [5, 2, 8]
 *
 * Min Stack:
 * [5, 2]
 *
 * Minimum becomes:
 * 2
 *
 * ⚙️ Approach:
 *
 * Maintain two stacks:
 *
 * 1. Main Stack
 *    Stores all elements.
 *
 * 2. Min Stack
 *    Stores only elements that are currently minimum.
 *
 * During Push:
 * - Push element to main stack.
 * - If element <= current minimum, push it to min stack.
 *
 * During Pop:
 * - Pop from main stack.
 * - If popped element equals current minimum,
 *   pop from min stack as well.
 *
 * During getMinimum():
 * - Return top of min stack.
 *
 * 🧮 Complexity Analysis:
 *
 * Push         : O(1)
 * Pop          : O(1)
 * Get Minimum  : O(1)
 *
 * Space        : O(N)
 *
 * 🧠 Key Insights:
 *
 * - Extra space is used to achieve constant-time minimum lookup.
 * - Duplicate minimum values must also be stored in minStack.
 * - minStack always contains the minimum element at its top.
 * - Common interview problem based on Stack design.
 *
 * 🔍 Related Topics:
 * Stack, Auxiliary Stack, Design Problems, O(1) Data Structures
 *
 * Author: Nishant Anand
 * Repository: DSA Learning
 */
public class StackWithGetMinimum {

	/**
	 * Main stack containing all elements.
	 */
	private Stack<Integer> stack;

	/**
	 * Auxiliary stack maintaining minimum values.
	 *
	 * Top of this stack always contains the current minimum.
	 */
	private Stack<Integer> minStack;

	/**
	 * Creates an empty StackWithGetMinimum.
	 */
	public StackWithGetMinimum() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	/**
	 * Pushes an element onto the stack.
	 *
	 * If the incoming element is less than or equal to the current
	 * minimum, it is also pushed into minStack.
	 *
	 * @param num Element to be pushed
	 */
	public void push(Integer num) {

		/*
		 * Store duplicate minimum values as well.
		 *
		 * Example:
		 * Push 2, Push 2
		 *
		 * If one 2 is popped later,
		 * minimum should still remain 2.
		 */
		if (minStack.isEmpty() || minStack.peek() >= num) {
			minStack.push(num);
		}

		stack.push(num);
	}

	/**
	 * Removes and returns the top element.
	 *
	 * If the removed element is also the current minimum,
	 * it must be removed from minStack as well.
	 *
	 * @return Popped element, or null if stack is empty
	 */
	public Integer pop() {

		if (stack.isEmpty()) {
			return null;
		}

		Integer num = stack.pop();

		/*
		 * Remove from minStack only when
		 * the current minimum is removed.
		 */
		if (num.equals(minStack.peek())) {
			minStack.pop();
		}

		return num;
	}

	/**
	 * Returns the minimum element currently present in the stack.
	 *
	 * @return Minimum element, or null if stack is empty
	 */
	public Integer getMinimum() {

		if (stack.isEmpty()) {
			return null;
		}

		return minStack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public String toString() {
		return "\n====\nStackWithGetMinimum\n\tstack=" + stack + "\n\tminStack=" + minStack + "\n====\n";
	}
	
	
}