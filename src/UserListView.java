import java.util.Comparator;
import java.util.List;

public class UserListView {

    private UserRepository userRepository;

    public UserListView(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void initialize() {
        System.out.println("========= LISTA UŻYTKOWNIKÓW =========");
        System.out.println("Imię\tNazwisko\tE-mail\tFunkcja");
        List<User> users = userRepository.findAll();
        users.sort(new UserComparator());
        for (User user: users) {
            System.out.println(user.getFirstName()+"\t"+user.getLastName()
                    +"\t"+user.getEmail()+"\t"+user.getRole().getTranslated());
        }
    }

}
