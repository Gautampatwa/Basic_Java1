package Day1;

import java.util.Scanner;

public class Employee {

    private int empNum;
    private double empSal;

    public Employee(int e, double s){
        empNum = e;
        empSal = s;
    }
    public int getEmpNum(){
        return empNum;
    }
    public double getSalary(){
        return empSal;

    }

    public static void main(String[] args) {

        Employee[] array = new Employee[7];
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter no of Employees:");
        int n=sc.nextInt();
        
        for(int i = 1; i <=n; i++) {
            System.out.printf("Please enter your employee number:");
            int e = sc.nextInt();
            System.out.printf("Please enter your salary:");
            double s = sc.nextDouble();
            array[i] = new Employee(e, s);
        }
        
        
        }
    @Override
    public String toString() {
        return "Employee{" +
                "empNum=" + empNum +
                ", empSal=" + empSal +
                '}';
    }
}
