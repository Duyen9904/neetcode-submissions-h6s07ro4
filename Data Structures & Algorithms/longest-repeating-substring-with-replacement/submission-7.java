class Solution {
    public int characterReplacement(String s, int k) {
       int[] freq = new int[26];
       int maxFreq = 0, longest = 0, left = 0;
       for(int i = 0; i < s.length(); i++){
        freq[s.charAt(i)-'A']++;
        maxFreq = Math.max(maxFreq, freq[s.charAt(i)-'A']);
        int windowSize = i-left+1;
        if(windowSize - maxFreq > k){
            freq[s.charAt(left)-'A']--;
            left++;
        }
        longest = Math.max(longest, i-left+1);
       }
       return longest;
    }
}

