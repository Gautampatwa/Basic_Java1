package Arrays;

public class Main1 {
    public static void main(String[] args) {
        Employees employees=new Employees();
        employees.toString();
        employees.setId(768);
        employees.setName("Mukesh");
        employees.setAddress("Gorakhpur");
        System.out.println(employees.getName());
        System.out.println(employees.getId());
        System.out.println(employees.getAddress());
    }
}
