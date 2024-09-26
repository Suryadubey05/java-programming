package string;

public class que107 {
    public static void main(String[] args) {
        String s ="hello bhai kaise ho";
        String op ="";
        for (int i =0; i<=s.length()-1; i++){
            char ch = s.charAt(i);
            if (ch==' '){
                System.out.println(op);
                op="";

            }else {
                op =op+ch;
            }
        }
        System.out.println(op);
    }
}
