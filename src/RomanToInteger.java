import java.util.List;

public class RomanToInteger {

    public int romanToInt(String s) {

        int result = 0;
        for (int i = 0; i < s.length(); i++) {//IV

            if (i + 1 != s.length() && s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {

                if(s.charAt(i + 1) == 'V') result = result + 4;
                if(s.charAt(i + 1) == 'X') result = result + 9;
                continue;
            }
            if (i != 0 && s.charAt(i - 1) == 'I' && (s.charAt(i) == 'V' || s.charAt(i) == 'X')) {
                continue;
            }


            if (i + 1 != s.length() && s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {

                if(s.charAt(i + 1) == 'L') result = result + 40;
                if(s.charAt(i + 1) == 'C') result = result + 90;
                continue;

            }
            if (i != 0 && s.charAt(i - 1) == 'X' && (s.charAt(i) == 'L' || s.charAt(i) == 'C')) {
                continue;
            }


            if (i + 1 != s.length() && s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {

                if(s.charAt(i + 1) == 'D') result = result + 400;
                if(s.charAt(i + 1) == 'M') result = result + 900;
                continue;

            }
            if (i != 0 && s.charAt(i - 1) == 'C' && (s.charAt(i) == 'D' || s.charAt(i) == 'M')) {
                continue;
            }




            if (s.charAt(i) == 'I') {
                result = result + 1;
            }
            if (s.charAt(i) == 'V') {
                result = result + 5;
            }

            if (s.charAt(i) == 'X') {
                result = result + 10;
            }
            if (s.charAt(i) == 'L') {
                result = result + 50;
            }
            if (s.charAt(i) == 'C') {
                result = result + 100;
            }
            if (s.charAt(i) == 'D') {
                result = result + 500;
            }
            if (s.charAt(i) == 'M') {
                result = result + 1000;
            }
        }


        return result;
    }
}
