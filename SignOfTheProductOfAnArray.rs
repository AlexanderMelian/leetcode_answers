impl Solution {
    pub fn array_sign(nums: Vec<i32>) -> i32 {
        
        let n_len = nums.len();
        let mut i = 0;
        let mut rta = 1;
        while i < n_len{
            if nums[i]>0{
                rta = rta*1;
                i+=1;
                continue;
            }
            if nums[i]<0{
                rta = rta*-1;
                i+=1;
                continue;
            }
            if nums[i]==0{
                rta = 0;
                break;
            }
            i+=1;
        }
        return rta;
        
        
    }
}