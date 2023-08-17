package NullExample;

public class Employee1{
String name;
int rollno;
    public Employee1()
    {
        System.out.println("Hello");
    }
    public void getDetails(String name, int rollno)
    {
        if(name!=null)
        {
          name="Mukesh";
        }
    }
    public void Employee1(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
}
class Employee
{
    public static void main(String[] args) {
        Employee1 employee1=new Employee1();
        employee1.getDetails("Kamal",88);
        System.out.println(employee1.getClass());
    }
}