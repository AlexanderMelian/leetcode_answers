class Solution {
    public void rotate(int[] nums, int k) {
        int nL = nums.length;
        int help = 0, help2=0;
        for(int j = 0; j<k; j++){
            for(int i = 0; i<nL; i++){
                if (i == 0){
                    help2 = nums[i];
                    nums[i] = nums[nL-1];
                }else{
                    help = nums[i];
                    nums[i] = help2;
                    help2 = help;
                }
            }
        }
    }
}