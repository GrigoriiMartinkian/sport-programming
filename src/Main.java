import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     /*   int[] nums = { 5, 1, 3, 6, 4, 2, 6};
        int target = 10;


        TwoSum per = new TwoSum();
        System.out.println(Arrays.toString(per.twoSum(nums, target)));
          */


       String[] strs = {"flower","flow","flight"};
        LongestCommonPrefix prf =new LongestCommonPrefix();

        System.out.println(prf.longestCommonPrefix(strs));
    }


}