package string;

public class que103_b {
    public static void main(String[] args) {
        String s="hhehh";
        Boolean isPallindrome = true;
        int j =s.length()-1;
        for(int i =0;i<=s.length()/2;i++){
           if (s.charAt(i)!=s.charAt(j)){
               isPallindrome =false;
               break;
           }
           j--;
        }
        if (isPallindrome) System.out.println("pallinedrome");
        else System.out.println("not pallin");
    }

}
