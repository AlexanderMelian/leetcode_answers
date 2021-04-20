class Solution {
    public int[] runningSum(int[] nums) {
        int total = 0, sumLen = nums.length;
    	for(int i = 0; i < sumLen ; i++) {
    		total += nums[i];
    		nums[i] = total;
    	}
    	return nums;
    }
}