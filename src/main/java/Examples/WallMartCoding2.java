package Examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WallMartCoding2 {

    public static void main(String[] args) {
        int[] numbers = new int[] {4,7,2,5,1,3};
        int target = 7;
        getIndicesForTarget(numbers,target);

    }
    public static void getIndicesForTarget(int[]a,int k){

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<a.length;i++){
            int diff = k-a[i];

            if(mp.containsKey(diff)){
                System.out.println("pairs:"+diff+","+a[i]+"indices: ["+mp.get(diff)+","+i+"]");
            }
            mp.put(a[i],i);
        }

    }
}
