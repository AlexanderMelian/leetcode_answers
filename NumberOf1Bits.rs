impl Solution {
    pub fn hammingWeight (mut n: u32) -> i32 {
        let mut sum = 0;
        while n > 0{
            if n % 2 == 1{
                sum +=1;
            }
            n = n/2;
        }
        return sum;
    }
}