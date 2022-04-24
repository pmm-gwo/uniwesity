import java.util.Scanner;

public class LoginForm {

    public void initialize() {
        FileUserRepository fileUserRepository = new FileUserRepository();
        String email = System.getenv("USER_EMAIL");
        String password = System.getenv("USER_PASSWORD");
        if (email == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("======== EKRAN LOGOWANIA ========");
            System.out.println("Podaj adres e-mail: ");
            email = scanner.nextLine();
            System.out.println("Podaj hasło: ");
            password = scanner.nextLine();
        }
        User loggedUser = fileUserRepository
                .findByEmailAndPassword(email, password);
        if (loggedUser != null) {
            System.out.println("Zalogowano jako:");
            System.out.println(loggedUser);
        } else {
            System.out.println("Dane nieprawidłowe, spróbuj ponownie");
            initialize();
        }
    }

}
