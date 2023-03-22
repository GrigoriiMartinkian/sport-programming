public class VowelStrings {
    private String[] vowel = {"a", "i", "u", "o", "e"};

    public int vowelStrings(String[] words, int left, int right) {

        int result = 0;
        for (; left <= right; left++) {
            if (isContain(words[left])) {
                result++;
            }

        }
        return result;
    }

    private boolean isContain(String word) {
        for (int j = 0; j < vowel.length; j++) {//j=0
            for (int y = 0; y < vowel.length; y++) {
                if (word.charAt(0) == vowel[j].charAt(0) &&
                        word.charAt(word.length() - 1) == vowel[y].charAt(0)) {        //"hey","aeo","mu","ooo","artro"
                    return true;
                }
            }
        }
        return false;
    }


}
