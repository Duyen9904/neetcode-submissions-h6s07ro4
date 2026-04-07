class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128]; // ASCII
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // Move left pointer if duplicate found
            left = Math.max(left, index[c]);

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);

            // Store next position (right + 1)
            index[c] = right + 1;
        }

        return maxLength;
    }
}