package Arrays;

public class Student {
    private String name;
    private int rollno;
    private String Address;

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + ", Address=" + Address + "]";
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public String setRollno(int rollno) {
        this.rollno = rollno;
        return null;
    }

    public String getAddress() {
        return Address;
    }

    public String setAddress(String address) {
        Address = address;
        return address;
    }

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Student(String name, int rollno, String address) {
        super();
        this.name = name;
        this.rollno = rollno;
        Address = address;
    }

    public void setAge(int i) {
        return;
    }

    public int getAge() {
        int age = 0;
        return age;
    }
}
