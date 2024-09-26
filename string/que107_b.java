package string;

public class que107_b {
    public static void main(String[] args) {
        String s = "hello bhai kaise ho";
        String words[]=s.split(" ");
        for (String word : words){
            System.out.println(word);
        }
    }
}
