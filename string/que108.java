package string;

public class que108 {                       //confusion
    public static String capitalize(String s, String newString){
        if (s.length()<=2) {
            return s.toUpperCase();
        }
            String first = Character.toString(s.charAt(0)).toUpperCase();
            String second = s.substring(1,s.length()-1);
            String third = Character.toString(s.charAt(s.length()-1)).toUpperCase();

        return newString = first +second+third+"";
    }
    public static void main(String[] args) {
        String s = "hello bhai kaise ho";
        String words[]=s.split("\\s ");
        String newString ="";

        System.out.println(capitalize(s,newString));
    }
}
