package string;

public class que105 {
    public static void main(String[] args) {
        String s="mynameissurya";
       int countOfVowel =0, countOfConsonent =0;
       for (int i =0 ;i<s.length();i++){
           char ch = s.charAt(i);
           switch (ch){
               case 'a','e','i','o','u' ->countOfVowel++;
               default -> countOfConsonent++;
           }
       }
        System.out.println("num of vowel is: "+countOfVowel+" and num of consonent is: "+countOfConsonent);
    }
}
