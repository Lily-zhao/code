package BinaryTree;

import java.util.Arrays;

public class FindRepectNumber {
    public int findRepeatNumberfc(int[] nums) {
        Arrays.sort(nums);
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1])
                temp = nums[i];
        }
        return temp;
    }
//    效率高
}
