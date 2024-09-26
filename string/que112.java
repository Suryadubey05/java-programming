package string;

public class que112 {
    public static void main(String[] args) {
        boolean ans =true;
        String s= "My Name Is Surya";
        String words[]=s.split("\\s");
        for (String w:words){
            String first = w.substring(0, 1);
            if (first != first.toUpperCase()){
                ans=false;
            }
        }
        System.out.println(ans);
    }
}
