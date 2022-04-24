public class AdministratorMenuView extends SystemMenuView {
    @Override
    public void initialize() {
        System.out.println("MENU ADMINISTRATORA");
        AdministratorMenuItem[] values = AdministratorMenuItem.values();
        System.out.println(AdministratorMenuItem.USER_LIST.getTranslated());
        System.out.println(AdministratorMenuItem.EXIT.getTranslated());
    }
}
