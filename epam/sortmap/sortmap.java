// Sort using only collections

package sortmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortmap {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(8);
        nums.add(80);
        nums.add(10);

        Collections.sort(nums);
        System.out.println(nums);
    };
}
