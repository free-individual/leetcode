class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currSumK = 0, ansK=Integer.MIN_VALUE, curSumRevK = 0, ansRevK = Integer.MAX_VALUE, n = nums.length;
        int total = 0;

        for(int i = 0 ; i < n; i++){
            currSumK += nums[i];
            ansK = Math.max(currSumK, ansK);
            if(currSumK < 0) currSumK = 0;
            curSumRevK += nums[i];
            ansRevK = Math.min(curSumRevK, ansRevK);
            if(curSumRevK > 0) curSumRevK = 0;
            total += nums[i];
        }        
        if(total == ansRevK) return ansK;
        return Math.max(ansK, total - ansRevK);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int max = nums[0];
        // int sum = 0;
        // int s = 0;
        // int i = 1;
        // while(i != s){
        //     if(i == nums.length) i %= nums.length;
        //     if(sum < 0){
        //         sum = 0;
        //         s = i % nums.length;
        //     }
        //     sum += nums[i % nums.length];
        //     max = Math.max(sum, max);
        //     i++;
        // }
        // return max;
    }
}