class Solution {
    public int[] plusOne(int[] digits) {
            int i = digits.length-1;
        boolean pass = false;
        while(i>=0){
            if(i == digits.length-1){
                digits[i] = digits[i]+1;
            }
            if(digits[i]==10){
                digits[i] = 0;
                pass = true;
            }else{
                pass = false;
            }
            if (pass){
                if(i == 0){
                    int[] result = new int[digits.length+1];
                    int k = 1;
                    result[0] = 1;
                    for (int j : digits) {
                        result[k] = j;
                        k++;
                    }
                    return result;
                }
                digits[i-1] = digits[i-1]+1;
            }
            i--;
        }
        return digits;
    }
}
