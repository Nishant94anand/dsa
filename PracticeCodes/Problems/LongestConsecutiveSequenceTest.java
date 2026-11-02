import java.util.Arrays;

/**
 * DSA-0.03 regression tests.
 * Learner chose the seven primary cases. Mentor supplied this plain-Java
 * harness, additional boundaries, an independent oracle and exhaustive tests.
 *
 * Run:
 *   javac LongestConsecutiveSequence.java LongestConsecutiveSequenceTest.java
 *   java LongestConsecutiveSequenceTest
 */
public final class LongestConsecutiveSequenceTest {
    private static int checked = 0;

    private static void verify(int[] input, int expected) {
        int[] snapshot = input.clone();
        int a = LongestConsecutiveSequence.longestConsecutiveBySorting(input);
        if (a != expected || !Arrays.equals(input, snapshot)) {
            throw new AssertionError("sort: " + Arrays.toString(snapshot) + " expected " + expected + ", got " + a);
        }
        int b = LongestConsecutiveSequence.longestConsecutiveByHashSet(input);
        if (b != expected || !Arrays.equals(input, snapshot)) {
            throw new AssertionError("hash: " + Arrays.toString(snapshot) + " expected " + expected + ", got " + b);
        }
        checked++;
    }

    private static boolean has(int[] arr, int value) {
        for (int x : arr) if (x == value) return true;
        return false;
    }

    // Independent, slow oracle used only on very short arrays.
    private static int oracle(int[] arr) {
        int best = 0;
        for (int start : arr) {
            int length = 1;
            for (long x = (long) start + 1; x <= Integer.MAX_VALUE && has(arr, (int) x); x++) {
                length++;
            }
            best = Math.max(best, length);
        }
        return best;
    }

    private static void enumerate(int[] arr, int pos, int[] alphabet) {
        if (pos == arr.length) {
            verify(arr, oracle(arr));
            return;
        }
        for (int x : alphabet) {
            arr[pos] = x;
            enumerate(arr, pos + 1, alphabet);
        }
    }

    public static void main(String[] args) {
        verify(new int[]{}, 0);
        verify(new int[]{4,2,1}, 2);
        verify(new int[]{3}, 1);
        verify(new int[]{6,2,7,10,6,8,10,9}, 5);
        verify(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE-1,0,Integer.MIN_VALUE,Integer.MIN_VALUE+1,Integer.MIN_VALUE+2}, 3);
        verify(new int[]{10,20,30}, 1);
        verify(new int[]{1,2,3,6,7,8,9}, 4);
        verify(new int[]{1,2,2,3,4}, 4);
        verify(new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE}, 1);
        verify(new int[]{-3,-2,-1,0,1}, 5);
        verify(new int[]{100,4,200,1,3,2}, 4);

        int[] values = {-2,-1,0,1,2,Integer.MIN_VALUE,Integer.MAX_VALUE};
        for (int len=0; len<=5; len++) enumerate(new int[len], 0, values);

        System.out.println("PASS: " + checked + " cases; both methods and input preservation verified");
    }
}
