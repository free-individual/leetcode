class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]) continue;
                if(nums[j] - nums[i] == k) count++;
            }
        }
        return count;
    }
}