import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        int i = 0, nL = nums.length;
        if(nL == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        while(i<nL-1){
            if (nums[i] != nums[i+1]){
                return nums[i];
            }
            
            i = i + 2;
        }
        return nums[nL-1];
    }
}