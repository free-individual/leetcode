class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int currSum = 0;
        int karr[] = new int[k];
        karr[0] = 1;
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            ans += karr[((currSum % k) + k) % k]++;
        }
        return ans;
    }
}