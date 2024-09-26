package string;

public class que110_leetcode {
    public static void main(String[] args) {
        String s  ="textbook";
        String s1="";
        int v=0,v1=0;
        for (int i =0; i<s.length()/2;i++){
            char ch = s.charAt(i);
            switch (ch){
                case 'a','e','i','o','u' ->v++ ;
            }
        }
        for (int i =s.length()-1;i>=s.length()/2;i--){
            char ch = s.charAt(i);
            switch (ch){
                case 'a','e','i','o','u' ->v1++ ;
            }
        }
        if (v==v1){
            System.out.println("Halves are alike");
        }else {
            System.out.println("not alike");
        }
    }
}
