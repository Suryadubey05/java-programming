package string;

public class que103 {
    public static void main(String[] args) {
        String s = "oooyyyooo";
        String m ="";
        for (int i=s.length()-1; i>=0;i--){
            m+=s.charAt(i);
        }
        if (s.equals(m)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
