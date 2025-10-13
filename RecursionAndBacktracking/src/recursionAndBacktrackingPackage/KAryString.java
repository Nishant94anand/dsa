package recursionAndBacktrackingPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code KAryString} class demonstrates how to generate all possible strings
 * (also known as K-ary strings) of a given length using a predefined set of characters.
 *
 * <p><b>Problem Statement:</b><br>
 * Given a set of allowed characters (size K) and a desired string length N,
 * generate all possible strings of length N using those characters.
 *
 * <p><b>Example:</b><br>
 * Allowed Characters = {'A', 'B', 'C'}<br>
 * Length = 2<br>
 * Output Strings:
 * <pre>
 * AA
 * AB
 * AC
 * BA
 * BB
 * BC
 * CA
 * CB
 * CC
 * </pre>
 *
 * <p><b>Approach (Recursive + Backtracking):</b><br>
 * Each recursive call fixes one character position in the string.  
 * Once the current index equals the target length, the formed string is added to the result list.  
 * The recursion backtracks after exploring each possible character at a given position.
 *
 * <p><b>Visualization of Recursive Calls (For length = 2, chars = {A, B}):</b><br>
 * <pre>
 *                  generateAllStrings(0)
 *                         |
 *          --------------------------------
 *          |                              |
 *   current[0] = 'A'                current[0] = 'B'
 *          |                              |
 *   generateAllStrings(1)           generateAllStrings(1)
 *          |                              |
 *      -----------                    -----------
 *      |         |                    |         |
 * current[1]='A' current[1]='B'  current[1]='A' current[1]='B'
 *      |         |                    |         |
 *   => "AA"   => "AB"             => "BA"   => "BB"
 * </pre>
 *
 * <p>
 * <b>Total Recursive Calls:</b> O(Kⁿ)  
 * <b>Time Complexity:</b> O(Kⁿ)  
 * <b>Space Complexity:</b> O(N) — for recursion depth and temporary string.
 * </p>
 *
 * <p><b>Author:</b> Nishant Anand</p>
 */
public class KAryString {

    /**
     * Entry point of the program.
     * <p>
     * Defines the allowed characters and desired string length, then
     * generates all possible combinations using recursion.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int length = 5;  // Desired string length
        char[] allowedChars = new char[] { 'A', 'B', 'C', 'D' };  // Allowed character set

        // Create instance of recursive generator
        K_AryStringsByRecursion recursionClass = new K_AryStringsByRecursion(length, allowedChars);

        // Generate all possible K-ary strings
        List<String> allStrings = recursionClass.generateAllStrings();

        // Print all generated strings
        for (String str : allStrings) {
            System.out.println(str);
        }
    }
}

/**
 * The {@code K_AryStringsByRecursion} class generates all possible strings of a given
 * length using a specified set of allowed characters through recursion.
 *
 * <p>Each recursive call fills one position of the string and explores all
 * possible character choices for that position.</p>
 */
class K_AryStringsByRecursion {
    /** The target length of each generated string. */
    int length;

    /** The set of characters allowed in the strings. */
    char[] allowedChars;

    /** The list that stores all generated K-ary strings. */
    List<String> allPossibleStrings;

    /** The temporary array representing the string being built recursively. */
    char[] currentString;

    /**
     * Constructs a new instance of the K-ary string generator.
     *
     * @param length       the desired string length
     * @param allowedChars the allowed characters for generation
     */
    public K_AryStringsByRecursion(int length, char[] allowedChars) {
        this.length = length;
        this.allowedChars = allowedChars;
        this.allPossibleStrings = new ArrayList<>();
        this.currentString = new char[length];
    }

    /**
     * Public method that initiates the recursive generation of all strings.
     *
     * @return a list containing all possible K-ary strings
     */
    public List<String> generateAllStrings() {
        generateAllStrings(0);
        return allPossibleStrings;
    }

    /**
     * Recursive helper function that generates all strings of the specified length.
     *
     * <p><b>Recursive Strategy:</b>
     * <ul>
     *   <li>If {@code index == length}: we’ve formed a complete string → add to results.</li>
     *   <li>Else: assign each possible character at {@code currentString[index]} and recurse to the next index.</li>
     * </ul>
     *
     * @param index the current position in the string being filled
     */
    private void generateAllStrings(int index) {
        // Base case: full string is formed
        if (index == length) {
            allPossibleStrings.add(new String(currentString));  // Convert char[] to String
            return;
        }

        // Recursive case: try each allowed character at current position
        for (int i = 0; i < allowedChars.length; ++i) {
            currentString[index] = allowedChars[i]; // Place character at current position
            generateAllStrings(index + 1);          // Recurse for next character
        }
    }
}