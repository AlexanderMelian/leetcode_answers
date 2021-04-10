class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int nL = nums.length;
        if(nL == 0){
            return 0;
        }
        if( nL == 1){
            if(nums[0] == 1){
                return 1;
            }else{
                return 0;
            }
        }
        int res = 0, help = 0;
        for (int i = 0; i < nL; i++) {
            if(nums[i] == 1){
                help += 1;
            }
            else{
                if(help > res){
                    res = help;
                }
                help = 0;
            }
        }
        if(help>res){
            return help;
        }
        return res;
    }
}