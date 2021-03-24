import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> toCompare = new HashSet<>();
        for (Integer i : nums) {
            if(!toCompare.add(i)){
                return true;
            }
        }
        return false;
    }
}