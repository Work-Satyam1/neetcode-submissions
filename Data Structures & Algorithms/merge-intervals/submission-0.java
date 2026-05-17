class Solution {
    public int[][] merge(int[][] intervals) {

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        for (int[] curr : intervals) {

            // If result is empty OR no overlap
            if (result.isEmpty() || result.get(result.size() - 1)[1] < curr[0]) {
                result.add(curr);
            } 
            else {
                // Merge intervals
                result.get(result.size() - 1)[1] =
                    Math.max(result.get(result.size() - 1)[1], curr[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}