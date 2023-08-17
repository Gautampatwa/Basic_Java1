package Interfaces;

public class Main {
    public static void main(String[] args) {
        Student student=new Student(new Interface1() {
            @Override
            public String hello() {
                return "Hello baby";
            }
        });
        student.setRollno(6);
        student.setName("Gdgt");
        student.setAddress("Delhi");
        System.out.println(student.getAddress());
        System.out.println(student.getName());
        System.out.println(student.getRollno());
    }
}
