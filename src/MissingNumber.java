public class MissingNumber {
    public int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int result = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = result;

                }
            }
        }

        for (int i=0;i < nums.length; i++) {  //[0,1,2,3,4,5,6,7,9]

            if (i != nums[i]) {
                return i;
            }
            if(i==nums.length-1){
                return nums.length;
            }

        }
        // for (int i = 0; i < nums.length; i++) {  //[0,1,2,3,4,5,6,7,9]
        //     int test=0;
        //            if (test == nums[i]) {
        //                test++;
        //            }
        //            else{
        //            return nums[i]
        //            }
        //        }

        return 0;


    }
}
