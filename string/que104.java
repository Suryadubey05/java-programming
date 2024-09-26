package string;

public class que104 {
    public static boolean isPallin(String s) {
        int i = 0, j = s.length() - 1;
        while (i++ < j--) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPallin("madam"));
        System.out.println(isPallin("labrador"));


    }
}
