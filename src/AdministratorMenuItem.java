public enum AdministratorMenuItem {

    USER_LIST,
    EXIT;

    public String getTranslated() {
        switch (this) {
            case USER_LIST:
                return "lista użytkowników";
            case EXIT:
                return "wyjście z programu";
        }
        throw new RuntimeException("Not supported");
    }

}
