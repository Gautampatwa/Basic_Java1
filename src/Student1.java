public class Student1 extends Common{
    private static final int id = 1;

    public Student1() {
        super(id);
    }

    public static void main(String[] args) {
        Student1 student1=new Student1();
        student1.getAddress();
        student1.getMob();
        student1.setAddress("Manika");
        System.out.println(student1.getAddress());
    }
}
