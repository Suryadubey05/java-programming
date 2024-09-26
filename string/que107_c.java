package string;

public class que107_c {
    public static void main(String[] args) {
        String str = "kya haal hai bsdk!";

        //Split sentence into words
        String words[] = str.split("\\s");
        String newString = "";

        for (String w : words) {
            String first = w.substring(0, 1);               //First Letter
            String rest = w.substring(1);         //Rest of the letter

            //Concatenete and reassign after
            //converting the first letter to uppercase
            newString += first.toUpperCase() + rest+  " \n";
        }

        //trim to remove the last redundant blank space
        System.out.println(newString.trim());
    }
}
