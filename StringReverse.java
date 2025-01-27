public class StringReverse {

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "";
      //System.out.print(str1.reversed());

        for (int i = str1.length() - 1; i >= 0; i--) {
            str2+=str1.charAt(i);



        }  System.out.print(str2);
    }
}












