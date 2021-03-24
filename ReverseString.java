class Solution {
    public void reverseString(char[] s) {
        int i = 0, sL = s.length, hsL = sL/2;
        char help;
        while(i<hsL){
            help = s[i];
            s[i] = s[sL-1-i];
            s[sL-1-i] = help;
            i++;
        }
    }
}