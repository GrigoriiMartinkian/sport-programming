public class SolutionThree {
    //s- abc
    public boolean isSubsequence(String s, String t) {

//        String s = "aaaaaa";
//        String t = "bbaaaa";

        if(s.equals("")) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {//j=1
                if (t.charAt(j) != s.charAt(i)) {//sdfghgfds
                    t = t.replaceFirst(Character.toString(t.charAt(j)), "");
                    j--;
                } else {
                    i++;
                    if(i==s.length()){break;}
                }
            }
        }
        //s=b
        //t=bcfghjkl;


           return t.contains(s);



    }
}
