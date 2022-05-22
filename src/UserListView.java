import java.util.Comparator;
import java.util.List;

public class UserListView {

    public void initialize() {
        System.out.println("========= LISTA UŻYTKOWNIKÓW =========");
        System.out.println("Imię\tNazwisko\tE-mail\tFunkcja");
        FileUserRepository fileUserRepository = new FileUserRepository();
        List<User> users = fileUserRepository.findAll();
        users.sort(new UserComparator());
        for (User user: users) {
            System.out.println(user.getFirstName()+"\t"+user.getLastName()
                    +"\t"+user.getEmail()+"\t"+user.getRole().getTranslated());
        }
    }

}
