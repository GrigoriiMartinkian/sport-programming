import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 6, 4, 2, 6};
        int target = 10;


        TwoSum per = new TwoSum();
        System.out.println(Arrays.toString(per.twoSum(nums, target)));
    }
}