
class Solution {
        public boolean canPartition(int[] nums) {

                int total = 0;

                        // Calculate total sum
                                for (int num : nums) {
                                            total += num;
                                                    }

                                                            // If total sum is odd, cannot partition equally
                                                                    if (total % 2 != 0) {
                                                                                return false;
                                                                                        }

                                                                                                int target = total / 2;

                                                                                                        // dp[i] = can we make sum i ?
                                                                                                                boolean[] dp = new boolean[target + 1];

                                                                                                                        dp[0] = true;

                                                                                                                                for (int num : nums) {

                                                                                                                                            // Traverse backwards
                                                                                                                                                        for (int j = target; j >= num; j--) {
                                                                                                                                                                        dp[j] = dp[j] || dp[j - num];
                                                                                                                                                                                    }
                                                                                                                                                                                            }

                                                                                                                                                                                                    return dp[target];
                                                                                                                                                                                                        }
                                                                                                                                                                                                        }
