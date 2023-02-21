public class Solution {//{2,3,2,3,5,5,8,6,6};

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean triger = false;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j] && i != j) {

                    triger = true;
                    break;
                }
            }
            if (!triger) {
                result = nums[i];
                break;
            }
        }

        return result;
    }
}


//  equals(nums[j])