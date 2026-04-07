class Solution {
    public int lengthOfLongestSubstring(String s) {
    
    int left = 0, maxLength = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i = 0; i < s.length() ;i++){
        char c = s.charAt(i);

        if(map.containsKey(c) && map.get(c) >= left){
            left = map.get(c) +1;
        }


        map.put(c, i);
        maxLength = Math.max(maxLength, i- left+1);
    }
    return maxLength;
    }
}