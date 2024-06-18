package Data_Structure_And_Algorithm.HasMap;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    String Name ;
    int Salary ;
    int id ;

    public Employee() {

    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Employee(String name, int Salary,int id){
        this.Name= name ;
        this.Salary= Salary ;
        this.id= id ;
    }
//    public static void getDetails(Employee emp, Employee emp1){
//        Map<String,Integer>map= new HashMap<>();

    public static void main(String[] args) {

      Map<Integer,Employee>Employeemap= new HashMap<>();

        Employeemap.put(1,new Employee("Nitesh",200000,10));
        Employeemap.put(2,new Employee("Rahul",3000,20));
        Employeemap.put(3,new Employee("Vishal",4000,30));
        Employeemap.put(4,new Employee("Aakash",6000,40));

        System.out.println(Employeemap);
    }
}
