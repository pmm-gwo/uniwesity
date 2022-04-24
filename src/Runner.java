public class Runner {

    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Bobowski",
                "janek342@gmail.com", "Jan@13", 344421L);
        Teacher teacher1 = new Teacher("Małgorzata", "Kowalska",
                "kowalska@gmail.com", "malg@onE", "mgr");
        System.out.println(student1);
        System.out.println(teacher1);
    }

}
