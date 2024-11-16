public class Polymorphism{
    public static void main(String[] args){

        Student stu1 = new Student("Jerick Guyala", "Brgy. 10, Balayan, Batangas", "BSIT", 2);
        System.out.println("Student Name: " + stu1.getName());
        System.out.println("Student Address: " + stu1.getAddress());
        System.out.println("Student Program: " + stu1.getProgram());
        System.out.println("Student Year: " + stu1.getYear());
        System.out.println(stu1.toString());
        System.out.println();
        

        Staff staff1 = new Staff("Christine De Padua", "Brgy. Navotas, Balayan, Batangas", "BatStateU-Balayan", 10000.00);
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff Program: " + staff1.getSchool());
        System.out.println("Staff Year: " + staff1.getSalary());
        System.out.println(staff1.toString());
        System.out.println();
    }
}




