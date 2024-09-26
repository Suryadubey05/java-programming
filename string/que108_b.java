package string;
                                             //confusion
public class que108_b {
    public static void main(String[] args) {
        String s ="kya haal hai bsdk";
        String words[] = s.split("\\s");
        String newString = "";

        for (String w : words) {
            String first = w.substring(0, 1);               //First Letter
            String rest = w.substring(1,words.length-1);
            String last = w.substring(words.length-1);
            newString += first.toUpperCase() + rest+ last.toUpperCase()+ " \n";
        }
        System.out.println(newString);
    }
}
