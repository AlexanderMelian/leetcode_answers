class Solution {
    public int thirdMax(int[] nums) {
        int nL = nums.length;
        int m1 = nums[0],m2 = nums[0],m3 = nums[0], band = 2;
        if(nL == 1){
            return nums[0];
        }if (nL == 2){
            if(nums[0] >= nums[1]){
                return nums[0];
            }else{
                return nums[1];
            }
        }
        
        else{
            for (int i = 1; i < nL; i++) {
                if(nums[i] == m1 || nums[i] == m2 || nums[i] == m3){
                    continue;
                }
                if(band>0){
                    if(nums[i]>=m1){
                        m3 = m2;
                        m2 = m1;
                        m1 = nums[i];
                    }
                    else if(band == 2){
                        m2 = nums[i];
                    }else{
                        if(nums[i]>=m2){
                            m3 = m2;
                            m2 = nums[i];
                        }
                        else{
                            m3 = nums[i];
                        }
                    }
                    band--;
                }
                else{
                    if(nums[i]>m1){
                    m3 = m2;
                    m2 = m1;
                    m1 = nums[i];
                }
                else if(nums[i]>m2){
                    m3 = m2;
                    m2 = nums[i];
                }
                else if(nums[i]>m3){
                    m3 = nums[i];
                }
            }
        }
        }
        if(band > 0){
            return m1;
        }
        return m3;
    }
}