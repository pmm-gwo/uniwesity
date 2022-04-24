import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Bobowski",
                "janek342@gmail.com", "Jan@13", 344421L);
        Teacher teacher1 = new Teacher("Małgorzata", "Kowalska",
                "kowalska@gmail.com", "malg@onE", "mgr");

        FileUserRepository fileUserRepository = new FileUserRepository();
//        fileUserRepository.insert(student1);
//        fileUserRepository.insert(teacher1);
//        System.out.println(fileUserRepository.findAll());

        Scanner scanner = new Scanner(System.in);
        System.out.println("======== EKRAN LOGOWANIA ========");
        System.out.println("Podaj adres e-mail: ");
        String email = scanner.nextLine();
        System.out.println("Podaj hasło: ");
        String password = scanner.nextLine();

        User loggedUser = fileUserRepository
                .findByEmailAndPassword(email, password);
        if (loggedUser != null) {
            System.out.println("Zalogowano jako "+loggedUser);
        } else {
            System.out.println("Dane nieprawidłowe");
        }
    }

}
