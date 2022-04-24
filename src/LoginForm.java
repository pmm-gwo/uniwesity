import java.util.Scanner;

public class LoginForm {

    public void initialize() {
        FileUserRepository fileUserRepository = new FileUserRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("======== EKRAN LOGOWANIA ========");
        System.out.println("Podaj adres e-mail: ");
        String email = scanner.nextLine();
        System.out.println("Podaj hasło: ");
        String password = scanner.nextLine();

        User loggedUser = fileUserRepository
                .findByEmailAndPassword(email, password);
        if (loggedUser != null) {
            System.out.println("Zalogowano jako " + loggedUser);
        } else {
            System.out.println("Dane nieprawidłowe, spróbuj ponownie");
            initialize();
        }
    }

}
