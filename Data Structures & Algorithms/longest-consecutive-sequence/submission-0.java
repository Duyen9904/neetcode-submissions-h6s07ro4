class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n:nums){
            set.add(n);
        }
        int longest = 0;
        for(int i: set){
            if(!set.contains(i-1)){
                int count = 1;
                int num = i;
                while(set.contains(num+1)){
                    count++;
                    num++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;

    }
}
