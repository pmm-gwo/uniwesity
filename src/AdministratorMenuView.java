public class AdministratorMenuView extends SystemMenuView {
    @Override
    public void initialize() {
        System.out.println("MENU ADMINISTRATORA");
        AdministratorMenuItem[] items = AdministratorMenuItem.values();
        for (AdministratorMenuItem item : items) {
            System.out.println(item.getNr() + " - " + item.getTranslated());
        }
    }

}
