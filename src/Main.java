import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void loginToAccount (){
        Scanner sc = new Scanner(System.in);
        String regex = "^[a-zA-Z0-9-_]{1,20}$";
        Pattern pattern = Pattern.compile(regex);

        String login = sc.nextLine();
        String password = sc.nextLine();
        String confirmPassword = sc.nextLine();
        if (!login.matches(regex)) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                throw new RuntimeException(e);
            }
        }
        if (!password.matches(regex) && password.equals(confirmPassword)) {
            try {
                throw new WrongPasswordException();
            } catch (WrongPasswordException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static void main(String[] args) {
loginToAccount();
    }
}