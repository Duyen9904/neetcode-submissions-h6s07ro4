class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i<nums.length;i++){
        int minusN = target-nums[i];
        if(map.containsKey(minusN)) return new int[]{map.get(minusN),i};
        map.put(nums[i],i);
      }
      return new int[0];
    }
}


