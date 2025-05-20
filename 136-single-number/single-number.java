class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], 1);
                l.add(nums[i]);
            }
            else{
                l.remove(Integer.valueOf(nums[i]));
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
        }
        return l.get(0);
    }
}