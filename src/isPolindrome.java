public class isPolindrome {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[,:.; ]","");
        s=s.toLowerCase();
        int t=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }



        }


        return true;
    }
}
