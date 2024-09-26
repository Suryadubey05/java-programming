public class javvaaa {
    public static void main(String[] args) {
        String str = "ssffeoeffss";
        boolean ans=true;
       int i=0, j=str.length()-1;
       while (i++ < j--){
           if (str.charAt(i)!=str.charAt(j)){
               ans=false;
               break;
           }else ans=true;
       }
        System.out.println(ans);
    }
}
