package oopsConcept;

class Student{

    String name ;
    int Class;
    int year ;

    public Student(){
        this.name= name ;
        this.Class= Class ;
        this.year= year ;
    }

    public void setName(String name){
        this.name= name ;
    }
    public String getName(){
        return name ;
    }



}

public class Employee04 {
    int salary ;
    String name ;
    String designation ;
    int age ;
    int ContactNo ;

    public Employee04() {
        this.salary = salary;
        this.name = name;
        this.designation = designation;
        this.age = age;
        this.ContactNo = ContactNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDestination(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContactNo() {
        return ContactNo;
    }

    public void setContactNo(int contactNo) {
        this.ContactNo = contactNo;
    }

    public static void main(String[] args) {

       Employee04 Emp1 = new Employee04();

       Emp1.setName("Nitesh");
        System.out.println(Emp1.getName());
       Emp1.age= 20 ;
        System.out.println(Emp1.getAge());
        Emp1.setSalary(10000);
        System.out.println(Emp1.getSalary());
        Emp1.setDestination("Mumbai");
        System.out.println(Emp1.getDesignation());
        Emp1.setContactNo(773893460);
        System.out.println(Emp1.getContactNo());



    }
}
