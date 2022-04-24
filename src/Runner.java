public class Runner {

    public static void main(String[] args) {
//        test();
        LoginForm loginForm = new LoginForm();
        loginForm.initialize();
    }

    private static void test() {
        Student student1 = new Student("Jan", "Bobowski",
                "janek342@gmail.com", "Jan@13", 344421L);
        Teacher teacher1 = new Teacher("Małgorzata", "Kowalska",
                "kowalska@gmail.com", "malg@onE", "mgr");

//        FileUserRepository fileUserRepository = new FileUserRepository();
//        fileUserRepository.insert(student1);
//        fileUserRepository.insert(teacher1);
//        System.out.println(fileUserRepository.findAll());
    }

}
