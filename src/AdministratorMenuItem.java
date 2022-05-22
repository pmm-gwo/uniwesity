public enum AdministratorMenuItem {

    USER_LIST(1),

    EXIT(2);

    private int nr;

    AdministratorMenuItem(int nr) {
        this.nr = nr;
    }

    public String getTranslated() {
        switch (this) {
            case USER_LIST:
                return "lista użytkowników";
            case EXIT:
                return "wyjście z programu";
        }
        throw new RuntimeException("Not supported");
    }

    public int getNr() {
        return nr;
    }

}
