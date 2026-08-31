class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int minusNumber = target - nums[i];
            if(map.containsKey(minusNumber)){
                return new int[]{map.get(minusNumber),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}


