class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:nums){
            if(map.containsKey(a)) return true;

            else {
                map.put(a,map.getOrDefault(a,0)+1);
            }

        }
        return false;
    }
}