import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = sc.nextLine();
        System.out.println("Введите пароль");
        String password = sc.nextLine();
        System.out.println("Подтвердите пароль");
        String confirmPassword = sc.nextLine();
        DataValidate.loginToAccount(login, password, confirmPassword);
    }
}