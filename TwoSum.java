class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] toReturn = new int[2];
        for(int i = 0; i < size;i++){
            for(int j = i+1; j < size; j++){
                if(nums[i]+nums[j] == target){
                    toReturn[0] = i;
                    toReturn[1] = j;
                    
                }
            }
        }
        return toReturn;
        }
}