package condition;

import java.util.Scanner;


public class que27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter one alphabet");
          char alp = sc.next().charAt(0);

        if(alp == 'a' || alp == 'e' || alp == 'i' || alp=='o' || alp == 'u'){
            System.out.println(alp+" is vovel");
        }else{
            System.out.println(alp+" is consonent");
        }

    }
}
