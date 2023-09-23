package Java8;

import java.util.Objects;

public class Employee {
    private String name;
    private String address;
    private String mobile;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String address, String mobile, int salary) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.salary == employee.salary && this.name.equals(employee.name) && Objects.equals(address, employee.address) && Objects.equals(mobile, employee.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, mobile, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee() {
    }
}
