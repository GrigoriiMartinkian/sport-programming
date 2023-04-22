import java.util.Arrays;

public class LeftRightDifference {
    public int[] leftRightDifference(int[] nums) {  //10,4,8,3
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] answer = new int[nums.length];
        int result1 = 0;
        int result2 = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                result1 = result1 + nums[j];
            }
            leftSum[i] = result1;
            result1 = 0;
        }
        System.out.println(Arrays.toString(leftSum));

        for (int i = nums.length-1; i >= 0; i--) {//15,11,3,0
            for (int j =  nums.length-1; j > i; j--) {
                result2 = result2 + nums[j];
            }
            rightSum[i] = result2;
            result2 = 0;
        }
        System.out.println(Arrays.toString(rightSum));
             for (int i = 0; i < nums.length; i++) {
              answer[i] = Math.abs(rightSum[i] - leftSum[i]);
              }

              return answer;
    }
}
