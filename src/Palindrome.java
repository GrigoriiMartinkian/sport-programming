public class Palindrome {

    public boolean method(int number) {
        String numberStr = Integer.toString(number);

        for (int i = 0; i < numberStr.length(); i++) {
            if (numberStr.charAt(i) != numberStr.charAt(numberStr.length() - i - 1)) {

                return false;

            }

        }


        return true;
    }
}