public class Inheritance_Implementation {
    public static void main(String[] args){

        Student stu1 = new Student("Jerick Guyala", "Brgy. 10, Balayan, Batangas", "BSIT", 2);
        System.out.println("Student Name: " + stu1.getName());
        System.out.println("Student Address: " + stu1.getAddress());
        System.out.println("Student Program: " + stu1.getProgram());
        System.out.println("Student Year: " + stu1.getYear());
        System.out.println();

        Staff staff1 = new Staff("Christine De Padua", "Brgy. Navotas, Balayan, Batangas", "BatStateU-Balayan", 10000.00);
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff Program: " + staff1.getSchool());
        System.out.println("Staff Year: " + staff1.getSalary());
    }
}

class Person{
    protected String name;
    protected String address;
    public void setName(String Name){
        this.name = Name;
    }
    public void setAddress(String Address){
        this.address = Address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
}

class Student extends Person{
    private String program;
    private Integer year;
    public Student(String Name, String Address, String Program, Integer Year){
        this.name = Name;
        this.address = Address;
        this.program = Program;
        this.year = Year;
    }
    public void setProgram(String Program){
        this.program = Program;
    }
    public void setYear(Integer Year){
        this.year = Year;
    }
    public Integer getYear(){
        return this.year;
    }
    public String getProgram(){
        return this.program;
    }
}

class Staff extends Person{
    private String school;
    private Double salary;
    public Staff(String Name, String Address, String School, Double Salary){
        this.name = Name;
        this.address = Address;
        this.school = School;
        this.salary = Salary;
    }
    public void setSchool(String School){
        this.school = School;

    }
    public void setSalary(Double Salary){
        this.salary = Salary;
    }
    public String getSchool(){
        return this.school;
    }
    public Double getSalary(){
        return this.salary;
    }
}