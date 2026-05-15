class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0, nums, target, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int index,
                          int[] nums,
                          int target,
                          List<Integer> current,
                          List<List<Integer>> result) {

        // Target achieved
        if (target == 0) {

            result.add(new ArrayList<>(current));

            return;
        }

        // Out of bounds or target negative
        if (index == nums.length || target < 0) {
            return;
        }

        // PICK
        current.add(nums[index]);

        // Stay at same index because reuse allowed
        backtrack(index, nums, target - nums[index], current, result);

        // BACKTRACK
        current.remove(current.size() - 1);

        // NOT PICK
        backtrack(index + 1, nums, target, current, result);
    }
}
