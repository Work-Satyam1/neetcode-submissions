class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // Sort by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // Overlap found
            if (intervals[i][0] < prevEnd) {
                count++;
            } 
            else {
                // No overlap
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }
}