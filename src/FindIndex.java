public class FindIndex {
    public int strStr(String haystack, String needle) {

        if (haystack.equals(needle)) {
            return 0;
        }
        int test = 0;
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length() - 1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    test++;
                    i++;
                } else {
                    test = 0;
                }
                if (test == needle.length()) {
                    return i - needle.length();
                }

            }
        }
        return -10;
    }
}
