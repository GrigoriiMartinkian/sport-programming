public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        String d[] = s.split(" ");
        String lastElement = d[d.length - 1];
        return lastElement.length();

    }


}
