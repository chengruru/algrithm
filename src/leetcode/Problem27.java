package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem27 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4};
        Problem27 demo = new Problem27();
//        System.out.println(demo.removeElement(nums));
    }
    public int removeElement(int[] nums, int val) {

        Arrays.sort(nums);
        int current;
        if (nums.length == 0)
            return 0;
        current = 0;
        for (int i = 1; i < nums.length ; i++){
            if (nums[i] == val){
                continue;
            }else{
                nums[++current] = nums[i];
            }

        }
        for (int i : nums)
            System.out.println(i);
        System.out.println("*******************");
        return current + 1;
    }
}
