import java.util.*;
public class LoginSystem {

    public static void main(String[] args) {
        int count = 3;
        String username = "Kanishka";
        String password = "Kani2124";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the user name:");
        String str1 = sc.next();
        System.out.println("enter the password:");
        String str2 = sc.next();
         {
            if (username.equalsIgnoreCase((str1)) && (password.equals(str2))) {
                System.out.println("Sucessfully logged in");

            } else {
                System.out.println("Inncorrect password && user name !");

            }
        }


    }
}



