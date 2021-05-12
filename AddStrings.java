class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1, j = num2.length()-1;
        int h = 0, carry = 0;
    	String res = "";
    	for(;i+j>-2;) {
    		if(i > -1 && j > -1) {
    			h = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(j));
    			i--;
    			j--;
    		}
    		else if(i>-1) {
    			h = Character.getNumericValue(num1.charAt(i));
    			i--;
    		}
    		else if(j>-1) {
    			h = Character.getNumericValue(num2.charAt(j));
    			j--;
    		}
    		if (carry != 0) {
				h += carry;
			}
			if(h > 9) {
				carry = h/10;
				h = h - 10;
			}else {
				carry = 0;
			}
		
    	res = String.valueOf(h) + res;
    	}
    	if(carry != 0) {
    		res = String.valueOf(carry)+res;
    	}
    	return res;
}
}