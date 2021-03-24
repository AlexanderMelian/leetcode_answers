import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> returned = new ArrayList<>();
        String help;
        for(int i = 1; i <=n; i++){
            if(i%3==0){
                help = "Fizz";
                if(i%5==0){
                    help = help+"Buzz";
                }
                returned.add(help);
            }
            else if(i%5==0){
                returned.add("Buzz");
            }else{
                returned.add(String.valueOf(i));
            }
        }
        return returned;
    }
}