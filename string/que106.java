package string;

public class que106 {
    public static void main(String[] args) {
        String s ="HELLOmiTRo";
        String op ="";
        for (int i=0; i<s.length();i++){
            char ch =s.charAt(i);                //capital to small ---> add 32
            if (ch >='A' && ch <= 'Z'){
                op =op+(char)(ch+32);
            } else if (ch>='a'&&ch<='z') {      //small to capital ----> subtract 32
                op=op+(char)(ch-32);
            }else {
                op =op+ch;
            }
        }
        System.out.println(s);
        System.out.println(op);
    }
}
