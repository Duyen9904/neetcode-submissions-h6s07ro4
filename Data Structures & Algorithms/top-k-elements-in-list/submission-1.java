class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Convert keys to list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort by frequency (descending)
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // Step 4: Build result
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
