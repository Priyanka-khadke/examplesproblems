package org;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EpamCoding {
    public static void main(String[] args) {
        int[] arry = {1,2,4,6,3};
        int[] arry2 = {-1,-3};
        int[] arry3 = {1,2,3};
        System.out.println(getSmallestPositiveMissingInteger(arry3));
        System.out.println(firstMissingPositive(arry3, arry3.length));

    }

    public static  int getSmallestPositiveMissingInteger(int[] a){
        Set<Integer> set = new HashSet<>();

        for(Integer i: a){
            if(i>0) {
                set.add(i);
            }
        }
        int ans = 1;
        for(int i=1; i<=a.length+1; i++){
            if(!(set.contains(i))) {
               ans = i;
               break;
            }
        }return ans;
    }

    public static int firstMissingPositive(int[] nums,
                                           int n)
    {
        Arrays.sort(nums);
        int ans = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ans)
                ans++;
        }
        return ans;
    }
}
