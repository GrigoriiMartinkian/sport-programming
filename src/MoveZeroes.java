import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-1; j++) {
                if (nums[j] == 0) {
                    int result = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = result;
                }
            }
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }

    }
}
