package string;

public class que111 {
    public static void main(String[] args) {
        String s ="mynamesurya";
        String str="";
        String newString1 ="";
        String newString2="";
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
            newString1+=ch;
            }else {
                newString2+=ch;
            }
        }
        str=newString1+newString2;

        System.out.println(str);
    }
}
