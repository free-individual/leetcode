class Solution {
    public int pivotIndex(int[] nums) {
        int n1[] = new int[nums.length];
        int n2[] = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int s1 = 0;
        int s2 = 0;
        while(i < nums.length){
            n1[i] = s1;
            s1 += nums[i];
            n2[j] = s2;
            s2 += nums[j];
            i++;
            j--;
        }
        i = 0;
        while(i < nums.length){
            if(n1[i] - n2[i] == 0) return i;
            i++;
        }
        return -1;
    }
}