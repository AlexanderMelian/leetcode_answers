import java.util.*;

class Solution {
    public int reverse(int x) {
        boolean isPositive = true;
        String help = String.valueOf(x);
        if(x == 0){
            return 0;
        }else if(x<0){
            isPositive = false;
            help = help.substring(1);
        }
        Stack<Character> stackHelper = new Stack<>();
        for (char y : help.toCharArray()) {
            stackHelper.push(y);
        }
        help = "";
        while(!stackHelper.isEmpty()){
            help = help + stackHelper.lastElement();
            stackHelper.pop();
        }
        if(!isPositive){
            help = "-" + help;
        }
        if((Long.parseLong(help)) > Integer.MAX_VALUE || Long.parseLong(help) < Integer.MIN_VALUE){
            return 0;
        }
        x = Integer.parseInt(help);
        return x;
    }
}
