class Solution {
    public int lengthOfLongestSubstring(String s) {
    
   int max = 0, left = 0;
   HashMap<Character, Integer> map = new HashMap<>();
   for(int i = 0; i < s.length(); i++){
    char c = s.charAt(i);

if(map.containsKey(c) && map.get(c) >= left){
    left = map.get(c) +1;
}


    map.put(c, i);

    max = Math.max(max,i-left +1 );
   }
   return max;
    }
}