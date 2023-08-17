package Interfaces;

public class Student implements Interface1{
    private String name;
    private int rollno;
    private String address;

    public Student(Interface1 interface1) {
        return ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String hello() {
        return null;
    }
}
