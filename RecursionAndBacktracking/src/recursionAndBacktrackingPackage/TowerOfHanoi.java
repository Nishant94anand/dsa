package recursionAndBacktrackingPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * The {@code TowerOfHanoi} class demonstrates the recursive solution to the classic
 * <b>Tower of Hanoi</b> problem — one of the most fundamental problems in recursion
 * and algorithm design.
 *
 * <p><b>Problem Statement:</b><br>
 * You are given three pegs (or rods) and {@code n} disks of different sizes, stacked on one
 * peg in decreasing size order (largest at the bottom, smallest at the top). The objective is
 * to move the entire stack to another peg, following these rules:
 * <ul>
 *   <li>Only one disk may be moved at a time.</li>
 *   <li>Each move consists of taking the top disk from one peg and placing it on another peg.</li>
 *   <li>No disk may be placed on top of a smaller disk.</li>
 * </ul>
 *
 * <p><b>Solution Approach (Recursive Logic):</b><br>
 * The Tower of Hanoi can be elegantly solved using recursion:
 * <ol>
 *   <li>Move {@code n-1} disks from the source peg to the auxiliary peg.</li>
 *   <li>Move the remaining largest disk directly from the source peg to the target peg.</li>
 *   <li>Move the {@code n-1} disks from the auxiliary peg to the target peg.</li>
 * </ol>
 *
 * <p><b>Visualization of Recursive Steps (n = 3):</b><br>
 * Below is a visual representation of how recursion unfolds:
 * <pre>
 *                  Move 3 disks from A → C using B
 *                  ┌─────────────────────────────┐
 *                  │ Move 2 disks from A → B     │
 *                  │   Move 1 disk from A → C    │
 *                  │   Move disk from A → B      │
 *                  │   Move 1 disk from C → B    │
 *                  └─────────────────────────────┘
 *                  Move disk from A → C
 *                  ┌─────────────────────────────┐
 *                  │ Move 2 disks from B → C     │
 *                  │   Move 1 disk from B → A    │
 *                  │   Move disk from B → C      │
 *                  │   Move 1 disk from A → C    │
 *                  └─────────────────────────────┘
 * </pre>
 *
 * <p>
 * The recursive tree has depth {@code n}, and at each level, the problem size
 * reduces by one until the base case ({@code n = 1}) is reached.
 * </p>
 *
 * <p><b>Time Complexity:</b> O(2ⁿ − 1)<br>
 * <b>Space Complexity:</b> O(n) — due to recursion call stack.
 * </p>
 *
 * <p><b>Author:</b> Nishant Anand</p>
 */
public class TowerOfHanoi {

    /**
     * The entry point of the program.
     * <p>
     * Initializes the pegs and demonstrates both:
     * <ul>
     *   <li>A textual recursive solution (printing moves)</li>
     *   <li>A visual simulation using {@code List<Stack<Integer>>} to represent the state of the pegs</li>
     * </ul>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        List<Stack<Integer>> pegStatus = new ArrayList<>();

        // Initialize first peg with disks (largest at bottom)
        Stack<Integer> peg1 = new Stack<>();
        peg1.push(3);
        peg1.push(2);
        peg1.push(1);

        // Initialize empty pegs
        Stack<Integer> peg2 = new Stack<>();
        Stack<Integer> peg3 = new Stack<>();

        // Add all pegs to the list for easy access
        pegStatus.add(peg1);
        pegStatus.add(peg2);
        pegStatus.add(peg3);

        System.out.println("Initial Peg Status: " + pegStatus);

        // Demonstrate the standard recursive Tower of Hanoi (text-based)
        towerOfHanoi(3, "Source Peg", "Target Peg", "Aux Peg");

        System.out.println("\n===== With Visualization =====");

        // Demonstrate recursive Tower of Hanoi with actual peg state visualization
        towerOfHanoi(3, 0, 2, 1, pegStatus);
    }

    /**
     * Recursive Tower of Hanoi solution that prints moves in textual form.
     *
     * @param numberOfDisks the number of disks to move
     * @param sourcePeg     the name of the source peg
     * @param toPeg         the name of the target peg
     * @param auxPeg        the name of the auxiliary peg used temporarily
     */
    private static void towerOfHanoi(int numberOfDisks, String sourcePeg, String toPeg, String auxPeg) {
        // Base case: if only one disk, directly move it to target peg
        if (numberOfDisks == 1) {
            System.out.printf("Transfer top disk from %s to %s%n", sourcePeg, toPeg);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary peg
        towerOfHanoi(numberOfDisks - 1, sourcePeg, auxPeg, toPeg);

        // Step 2: Move the largest disk to target peg
        towerOfHanoi(1, sourcePeg, toPeg, auxPeg);

        // Step 3: Move n-1 disks from auxiliary to target peg
        towerOfHanoi(numberOfDisks - 1, auxPeg, toPeg, sourcePeg);
    }

    /**
     * Recursive Tower of Hanoi solution with actual visualization using stacks.
     * <p>
     * After each move, it prints the current state of all pegs.
     *
     * @param numberOfDisks the number of disks to move
     * @param sourcePeg     index of the source peg (0-based)
     * @param targetPeg     index of the target peg (0-based)
     * @param auxPeg        index of the auxiliary peg (0-based)
     * @param pegStatus     list representing all pegs as stacks
     */
    private static void towerOfHanoi(int numberOfDisks, int sourcePeg, int targetPeg, int auxPeg, List<Stack<Integer>> pegStatus) {
        // Base case: if only one disk, perform direct move and update visualization
        if (numberOfDisks == 1) {
            System.out.printf("Transfer top disk from %s to %s%n", sourcePeg, targetPeg);

            // Pop from source peg
            int topElement = pegStatus.get(sourcePeg).pop();

            // Push to target peg
            pegStatus.get(targetPeg).push(topElement);

            // Display current state of all pegs
            System.out.println("==> Current Peg Status: " + pegStatus);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary peg
        towerOfHanoi(numberOfDisks - 1, sourcePeg, auxPeg, targetPeg, pegStatus);

        // Step 2: Move remaining largest disk to target peg
        towerOfHanoi(1, sourcePeg, targetPeg, auxPeg, pegStatus);

        // Step 3: Move n-1 disks from auxiliary to target peg
        towerOfHanoi(numberOfDisks - 1, auxPeg, targetPeg, sourcePeg, pegStatus);
    }
}
