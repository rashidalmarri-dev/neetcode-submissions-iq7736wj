class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffDict = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (diffDict.containsKey(diff)) {
                return new int[] {diffDict.get(diff), i};
            }
            diffDict.put(nums[i], i);
        }
        return new int[] {};
    }
}
