import java.util.Scanner;

public class AdministratorMenuView extends SystemMenuView {
    @Override
    public void initialize() {
        System.out.println("MENU ADMINISTRATORA");
        AdministratorMenuItem[] items = AdministratorMenuItem.values();
        for (AdministratorMenuItem item : items) {
            System.out.println(item.getNr() + " - " + item.getTranslated());
        }
        System.out.println("Twój wybór: ");
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        AdministratorMenuItem menuItem = AdministratorMenuItem.ofNr(nr);
        switch (menuItem) {
            case USER_LIST:
                UserListView userListView = new UserListView();
                userListView.initialize();
                initialize();
                break;
        }
    }

}
