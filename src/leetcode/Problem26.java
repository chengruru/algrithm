package leetcode;

public class Problem26 {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 3, 4};
        Problem26 demo = new Problem26();
        System.out.println(demo.removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        int current;
        if (nums.length == 0)
            return 0;
        current = 0;
        for (int i = 1; i < nums.length ; i++){
            if (nums[i] == nums[current]){
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
