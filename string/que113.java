package string;

import java.util.Arrays;

public class que113 {
    public static void main(String[] args) {
        boolean isAnagram = true;
        char str1[] = {'c', 'a', 'r'};
        char str2[] = {'a', 'r', 'c'};

        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2) isAnagram = false;
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                isAnagram = false;
            }
        }
        System.out.println(isAnagram);

    }
}
