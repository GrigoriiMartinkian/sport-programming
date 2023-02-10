public class LongestCommonPrefix {
    //"flower","flow","fight"
    public String longestCommonPrefix(String[] strs) {

        String result;

        for (int i = 0; i < strs.length; i++) {

            for (int j = 0; j < strs.length; j++) {

                if (strs[i].charAt(j) == strs[i + 1].charAt(j + 1) ) {
                   result=strs[i].charAt(j);
                    return result;
                }
            }
        }
        return result;
    }
}
