class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        
                int nSize = nums.size();
        if (nSize == 0){
            return 0;
        }
        if (nSize == 1){
            if(k>0 || nums[0] == 1){
                return 1;
            }
            return 0;
        }
        int res = 0, i, j;
        for(i = 0,j = 0; i < nSize; i++){
            if(nums[i] == 0){
                k--;
            }
            if(k == -1){
                if(res<i-j){
                res = i-j;
                }
                while(j<i && nums[j] == 1){
                    j++;
                }
                j++;
                k++;
            }
        }
        if(res<i-j){
            res = i-j;
        }
        
        return res;
    
        
    }
};