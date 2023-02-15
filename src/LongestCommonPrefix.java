public class LongestCommonPrefix {
    //"flower","flow","flight"
    public String longestCommonPrefix(String[] strs) {

        String pref = strs[0];

        for (int i = 0; i < strs.length; i++) {
            pref = prefGenerator(pref, strs[i]);
        }
        return pref;
    }

    public String prefGenerator(String pref, String word) {
        String result = "";
        if (pref.equals(word)) {
            return pref;
        } else {
            for (int i = 0; i < word.length() && i < pref.length(); i++) {
                if (word.charAt(i) == pref.charAt(i)) {

                    result = result + word.charAt(i);

                } else {
                    return result;
                }
            }
            return result;

        }


    }
}

