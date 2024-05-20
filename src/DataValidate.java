import java.util.regex.Pattern;

public class DataValidate {
    public static void loginToAccount(String login, String password, String confirmPassword) {
        String regex = "^[a-zA-Z0-9-_]{1,20}$";
        try {
            if (!Pattern.matches(regex, login)) {
                throw new WrongLoginException();
            }
            if (!Pattern.matches(regex, password) || !password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException wrongLoginException) {
//            System.out.println("f");
        } catch (WrongPasswordException wrongPasswordException) {
//            System.out.println("ff");
        }
    }
}
