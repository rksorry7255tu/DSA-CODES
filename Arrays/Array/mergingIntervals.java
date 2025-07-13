import java.util.*;

class Solution {
  public int[][] merge(int[][] intervals) {
    if (intervals.length <= 1)
      return intervals;

    // Step 1: Sort intervals by start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> merged = new ArrayList<>();

    // Step 2: Iterate and merge
    int[] current = intervals[0];
    merged.add(current);

    for (int i = 1; i < intervals.length; i++) {
      int currentEnd = current[1];
      int nextStart = intervals[i][0];
      int nextEnd = intervals[i][1];

      if (currentEnd >= nextStart) {
        // Overlapping intervals: merge them
        current[1] = Math.max(currentEnd, nextEnd);
      } else {
        // No overlap: add new interval
        current = intervals[i];
        merged.add(current);
      }
    }

    // Convert List<int[]> to int[][]
    return merged.toArray(new int[merged.size()][]);
  }
}
