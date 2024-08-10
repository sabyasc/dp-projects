// Sort with collections using Comparator Interface

package sortmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortmapcomparator {

    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>(){
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List <Integer> nums = new ArrayList<Integer>();

        nums.add(234);
        nums.add(36);
        nums.add(2);
        nums.add(172);
        nums.add(39);

        Collections.sort(nums, comp);;

        System.out.println(nums);

    }

}
