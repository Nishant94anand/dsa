package com.nishant.dsa.stacks.stackWithThreshold;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * DSA Topic - Stack with Threshold (Set of Stacks)
 *
 * 📘 Overview: Implements a stack that automatically creates additional stacks
 * when the current stack reaches a predefined capacity threshold.
 *
 * From the consumer's perspective, this behaves exactly like a normal stack.
 * Internally however, multiple stacks are maintained to avoid a single stack
 * becoming excessively large.
 *
 * This problem is commonly known as:
 *
 * - Set Of Stacks - Stack Of Plates
 *
 * 🧩 Example:
 *
 * Threshold = 3
 *
 * Push:
 *
 * 1, 2, 3
 *
 * Stack #1: [1, 2, 3]
 *
 * Push 4
 *
 * Stack #1: [1, 2, 3]
 *
 * Stack #2: [4]
 *
 * Push 5
 *
 * Stack #2: [4, 5]
 *
 * Push 6
 *
 * Stack #2: [4, 5, 6]
 *
 * Push 7
 *
 * Stack #3: [7]
 *
 * ⚙️ Approach:
 *
 * Maintain:
 *
 * List<Stack<Integer>>
 *
 * The last stack is considered the active stack.
 *
 * During Push:
 *
 * - If active stack reaches threshold, create a new stack.
 *
 * During Pop:
 *
 * - Pop from active stack. - Remove empty stacks automatically.
 *
 * 🧮 Complexity Analysis:
 *
 * Push : O(1) Pop : O(1) Size : O(1) Is Empty : O(1)
 *
 * Space : O(N)
 *
 * 🧠 Key Insights:
 *
 * - Demonstrates composition of data structures. - Internally uses multiple
 * stacks while exposing a single stack API. - Useful when individual stacks
 * should not exceed a maximum size. - Similar to real-world stacks of plates.
 *
 * 🔍 Related Topics: Stack, Dynamic Data Structures, Composition, Stack Of
 * Plates
 *
 * Author: Nishant Anand Repository: DSA Learning
 */
public class LoadBalancingStack {

	/**
	 * Internal collection of stacks.
	 *
	 * The last stack is always considered the active stack.
	 */
	private List<Stack<Integer>> stackList;

	/**
	 * Maximum number of elements allowed in a single stack.
	 */
	private int threshold;

	/**
	 * Default threshold used by the no-argument constructor.
	 */
	private static final int DEFAULT_THRESHOLD = 10;

	/**
	 * Creates a stack with the default threshold.
	 */
	public LoadBalancingStack() {

		initializeStacks();

		this.threshold = DEFAULT_THRESHOLD;
	}

	/**
	 * Creates a stack with a custom threshold.
	 *
	 * @param threshold Maximum size of each internal stack
	 */
	public LoadBalancingStack(int threshold) {

		if (threshold <= 0) {
			throw new IllegalArgumentException("Threshold must be greater than zero.");
		}

		initializeStacks();

		this.threshold = threshold;
	}

	/**
	 * Pushes an element onto the stack.
	 *
	 * If the active stack reaches capacity, a new stack is automatically created.
	 *
	 * @param num Element to be pushed
	 */
	public void push(Integer num) {

		createNewActiveStackIfRequired();

		Stack<Integer> activeStack = getActiveStack();

		activeStack.push(num);
	}

	/**
	 * Removes and returns the top-most element.
	 *
	 * Empty internal stacks are removed automatically.
	 *
	 * @return Popped element or exception if empty
	 */
	public Integer pop() {

		Stack<Integer> activeStack = getActiveStack();

		Integer num = activeStack.pop();

		removeExistingStackIfRequired();

		return num;
	}

	/**
	 * Returns the total number of elements across all internal stacks.
	 *
	 * Optimization:
	 *
	 * All stacks except the active stack are guaranteed to be full. Therefore size
	 * can be calculated mathematically without traversing all stacks.
	 *
	 * @return Total element count
	 */
	public int size() {

		int stacksCount = stackList.size();

		return ((stacksCount - 1) * threshold) + getActiveStack().size();
	}

	/**
	 * Determines whether the stack contains any elements.
	 *
	 * @return true if empty, otherwise false
	 */
	public boolean isEmpty() {

		if (stackList.size() > 1) {
			return false;
		}

		return getActiveStack().isEmpty();
	}

	/**
	 * Removes the active stack if it becomes empty.
	 *
	 * At least one stack is always maintained.
	 */
	private void removeExistingStackIfRequired() {

		Stack<Integer> activeStack = getActiveStack();

		if (activeStack.isEmpty() && stackList.size() > 1) {

			stackList.removeLast();
		}
	}

	/**
	 * Creates a new active stack if the current one reaches threshold.
	 */
	private void createNewActiveStackIfRequired() {

		Stack<Integer> activeStack = getActiveStack();

		if (activeStack.size() == threshold) {

			Stack<Integer> newStack = new Stack<>();

			stackList.add(newStack);
		}
	}

	/**
	 * Returns the currently active stack.
	 *
	 * The active stack is always the last stack in the list.
	 *
	 * @return Active stack
	 */
	private Stack<Integer> getActiveStack() {

		return stackList.get(stackList.size() - 1);
	}

	/**
	 * Initializes the internal stack collection.
	 *
	 * One stack is always maintained even when the structure is empty.
	 */
	private void initializeStacks() {

		this.stackList = new ArrayList<>();

		stackList.add(new Stack<Integer>());
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("\n ==== Load Balancing Stack ==== \n");

		sb.append("\tThreshold: ").append(threshold);

		for (int i = 0; i < stackList.size(); ++i) {

			sb.append("\n");

			sb.append("\t");
			sb.append("Stack #").append(i + 1).append("\t:\t").append(stackList.get(i));

			if (i == stackList.size() - 1) {
				sb.append("\t <== Active Stack");
			}
		}

		sb.append("\n =============================== \n");

		return sb.toString();
	}
}