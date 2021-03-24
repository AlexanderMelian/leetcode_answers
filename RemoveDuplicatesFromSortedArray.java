class Solution {
    public int removeDuplicates(int[] nums) {
            int ans = 0, nL = nums.length;
        for (int i = 1; i < nL; i++)
            if (nums[i] != nums[ans]){
                nums[++ans] = nums[i];
            }
        return ans + 1;
    } 
    
}