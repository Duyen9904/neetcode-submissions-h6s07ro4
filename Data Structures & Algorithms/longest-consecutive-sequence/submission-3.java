class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> sets = new HashSet<Integer>();
        for(int i: nums){
            sets.add(i);
        }
        int longest = 0;
        for(int i : sets){
            
            if(!sets.contains(i-1)){
                int length = 1;
                int currentNum = i;
                while(sets.contains(currentNum+1)){
                    length++;
                    currentNum++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
