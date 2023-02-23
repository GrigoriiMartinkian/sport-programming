public class SolutionTwo {
    public boolean isAnagram(String s, String t) {
        
        int k=0;
     for(int i=0; i<s.length(); i++){
       for(int j=0; j<t.length(); j++) {

           if (s.charAt(i) == t.charAt(j)){
               k++;
               break;
           }
       }
     }
     if(k==s.length()){
         return true;
     }
     return false;
    }

}
