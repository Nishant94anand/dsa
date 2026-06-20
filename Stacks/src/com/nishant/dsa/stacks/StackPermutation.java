package com.nishant.dsa.stacks;

import java.util.Stack;

/**
 *
 * DSA Topic - Stack Permutation
 *
 * 📘 Overview:
 * Given a source sequence and a target sequence, determine whether the target
 * sequence can be generated using only Stack Push and Pop operations while
 * processing the source sequence from left to right.
 *
 * If possible, return the sequence of operations:
 *
 * S = Push
 * X = Pop
 *
 * Otherwise return:
 *
 * IMPOSSIBLE
 *
 * 🧩 Example 1:
 *
 * Source:
 * 123456
 *
 * Target:
 * 325641
 *
 * Operations:
 * SSSXXSSXSXXX
 *
 * Verification:
 *
 * Push 1
 * Push 2
 * Push 3
 * Pop  -> 3
 * Pop  -> 2
 * Push 4
 * Push 5
 * Pop  -> 5
 * Push 6
 * Pop  -> 6
 * Pop  -> 4
 * Pop  -> 1
 *
 * Output:
 * 325641
 *
 * Hence Possible.
 *
 * 🧩 Example 2:
 *
 * Source:
 * 123456
 *
 * Target:
 * 154623
 *
 * Execution:
 *
 * 1 -> Possible
 * 5 -> Possible
 * 4 -> Possible
 * 6 -> Possible
 *
 * Need:
 * 2
 *
 * Current Stack:
 * [2, 3]
 *
 * Top = 3
 *
 * Since stack is LIFO, 3 must be popped before 2.
 * But target expects 2 before 3.
 *
 * Hence IMPOSSIBLE.
 *
 * ⚙️ Approach:
 *
 * For every target character:
 *
 * 1. Keep pushing source elements until:
 *      - Target character appears on stack top
 *      OR
 *      - Source is exhausted
 *
 * 2. If stack top equals target character:
 *      Pop it.
 *
 * 3. Otherwise:
 *      Target cannot be generated.
 *
 * This works because Stack allows access only to the top element.
 *
 * 🧮 Complexity Analysis:
 *
 * Time  : O(N)
 * Space : O(N)
 *
 * Why O(N)?
 *
 * Each source character:
 * - Pushed at most once
 * - Popped at most once
 *
 * Therefore total stack operations are linear.
 *
 * 🧠 Key Insights:
 *
 * - This is a classic Stack Permutation problem.
 * - Simulation is the optimal solution.
 * - There is no better than O(N) because every target element must be examined.
 * - Nested loops do NOT make this O(N²) because each element participates in
 *   at most one push and one pop.
 *
 * 🔍 Related Topics:
 * Stack, Simulation, Stack Permutations, Validation Problems
 *
 * Author: Nishant Anand
 * Repository: DSA Learning
 */
public class StackPermutation {

	/**
	 * Driver method.
	 *
	 * Demonstrates both possible and impossible stack permutations.
	 *
	 * Example:
	 *
	 * Source : 123456
	 * Target : 325641
	 *
	 * Output:
	 * SSSXXSSXSXXX
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {

		String sourceString = "123456";

		String targetString = "325641"; // SSSXXSSXSXXX

//		String targetString = "154623"; // IMPOSSIBLE

		String output = getPermutationPossibility(
				sourceString,
				targetString);

		System.out.println(output);
	}

	/**
	 * Determines whether the target sequence can be generated using stack
	 * operations and returns the operation trace.
	 *
	 * Operation Legend:
	 *
	 * S -> Push
	 * X -> Pop
	 *
	 * Example:
	 *
	 * Source : 123456
	 * Target : 325641
	 *
	 * Returns:
	 * SSSXXSSXSXXX
	 *
	 * @param sourceString Source sequence
	 * @param targetString Desired output sequence
	 *
	 * @return Stack operation sequence if possible, otherwise IMPOSSIBLE
	 */
	public static String getPermutationPossibility(
			String sourceString,
			String targetString) {

		StringBuilder sb = new StringBuilder();

		if (!sourceString.isEmpty() && !targetString.isEmpty()) {

			int targetStringIndex = 0;
			int sourceStringIndex = 0;

			Stack<Character> stk = new Stack<Character>();

			/*
			 * Process target characters one-by-one.
			 */
			while (targetStringIndex < targetString.length()) {

				Character targetChar =
						targetString.charAt(targetStringIndex);

				/*
				 * Keep pushing until:
				 *
				 * 1. Source gets exhausted
				 * OR
				 * 2. Target character appears on stack top
				 */
				while (sourceStringIndex < sourceString.length()
						&& (stk.isEmpty()
								|| !stk.peek().equals(targetChar))) {

					push(
							stk,
							sourceString.charAt(sourceStringIndex++),
							sb);
				}

				/*
				 * If target character is available on stack top,
				 * pop it and move to the next target character.
				 */
				if (!stk.isEmpty()
						&& stk.peek().equals(targetChar)) {

					pop(stk, sb);

					targetStringIndex++;

				} else {

					/*
					 * Target character cannot be reached.
					 *
					 * Example:
					 *
					 * Stack = [2, 3]
					 * Need  = 2
					 *
					 * Since 3 blocks 2 and source is exhausted,
					 * target sequence is impossible.
					 */
					sb = new StringBuilder();

					break;
				}
			}
		}

		if (sb.isEmpty()) {
			sb.append("IMPOSSIBLE");
		}

		return sb.toString();
	}

	/**
	 * Pushes a character onto the stack and records the operation.
	 *
	 * S = Push
	 *
	 * @param stk Stack
	 * @param ch Character to push
	 * @param sb Operation trace
	 */
	private static void push(
			Stack<Character> stk,
			Character ch,
			StringBuilder sb) {

		stk.push(ch);

		sb.append('S');
	}

	/**
	 * Pops a character from the stack and records the operation.
	 *
	 * X = Pop
	 *
	 * @param stk Stack
	 * @param sb Operation trace
	 *
	 * @return Popped character
	 */
	private static Character pop(
			Stack<Character> stk,
			StringBuilder sb) {

		sb.append('X');

		return stk.pop();
	}
}