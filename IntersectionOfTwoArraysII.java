import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> forRes = new ArrayList<Integer>();
        ArrayList<Integer> indexR = new ArrayList<Integer>();
        int i = 0, j = 0 ,n1L = nums1.length, n2L = nums2.length;
        while(i < n1L){
            j = 0;
            while(j < n2L){
                if(indexR.contains(j)){
                    j++;
                    continue;
                }
                if(nums1[i] == nums2[j]){
                    indexR.add(j);
                    forRes.add(nums2[j]);
                    break;
                }
                j++;
            }
            i++;
        }

        int res[] = new int[forRes.size()];
        int cont = 0;
        for (int x : forRes) {
            res[cont] = x;
            cont++;
        }
        return res;
    }
}