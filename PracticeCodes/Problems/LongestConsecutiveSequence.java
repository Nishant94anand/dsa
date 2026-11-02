import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * DSA Topic - Longest Consecutive Sequence
 * ----------------------------------------
 * Overview: Find the longest consecutive-value run in an unsorted int array.
 * Example: [100, 4, 200, 1, 3, 2] => 4 for values 1, 2, 3, 4.
 * Approaches: sorted clone (O(n log n)); HashSet start detection (expected O(n)).
 * Complexity: O(n) auxiliary space for either approach; input unchanged.
 * Learner-written methods; hash variant improved with mentor debugging.
 */
public final class LongestConsecutiveSequence {
    private LongestConsecutiveSequence() {}

    public static int longestConsecutiveBySorting(int[] nums) {
        if (nums.length == 0) return 0;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int longest = 1;
        int current = 1;
        for (int i = 1; i < sorted.length; i++) {
            int curr = sorted[i];
            int prev = sorted[i - 1];

            if (curr == prev) {
                continue; // Duplicate must neither extend nor break the run.
            } else if (curr == prev + 1) {
                current++;
            } else {
                current = 1;
            }
            longest = Math.max(longest, current);
        }
        return longest;
    }

    public static int longestConsecutiveByHashSet(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;
        for (Integer num : set) {
            int current = 0;
            if (num > Integer.MIN_VALUE && set.contains(num - 1)) {
                continue; // Only start a run if its predecessor does not exist.
            }

            int val = num;
            while (set.contains(val)) {
                current++;
                if (val == Integer.MAX_VALUE) break; // Prevent overflow.
                val++;
            }
            longest = Math.max(longest, current);
        }
        return longest;
    }
}
