class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
           if(map.containsKey(target-nums[i]))
           {
            int idx=map.get(target-nums[i]);
            int indx=i;
            return new int[]{idx,indx};
           }

           map.put(nums[i],i);
        }
        
    return new int[]{};
    }
}
