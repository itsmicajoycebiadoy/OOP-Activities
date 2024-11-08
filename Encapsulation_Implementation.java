public class Encapsulation_Implementation {
    public static void main(String[] args){
    
        Student stu1 = new Student();
        stu1.setId(2311646);
        stu1.setName("Mica Joyce Biadoy");
        System.out.println("Student ID: " + stu1.getId());
        System.out.println("Student Name: " + stu1.getName());
        System.out.println();

        Book bk1 = new Book();
        bk1.setAuthor("Coleen Hoover");
        bk1.setBookNumber(800);
        bk1.setPrice(500.00);
        bk1.setTitle("It Starts WIth Us");
        System.out.println("Book No.: " + bk1.getBookNumber());
        System.out.println("Book Author: " + bk1.getAuthor());
        System.out.println("Book Title: " + bk1.getTitle());
        System.out.println("Book Price: " + bk1.getPrice());
        System.out.println();
    }
}
 
class Student{
    private int StudentId;
    private String Name;

    public void setId(int studentId){
        this.StudentId = studentId;
    }
    public void setName(String studentName){
        this.Name = studentName;
    }
    public String getName(){
        return this.Name;
    }
    public Integer getId(){
        return this.StudentId;
    }
}

class Book{
    private int bookNumber;
    private String Title;
    private String Author;
    private Double Price;

    public void setBookNumber(Integer bookNumber){
        this.bookNumber = bookNumber;
    }
    public void setTitle(String title){
        this.Title = title;
    }
    public void setAuthor(String author){
        this.Author = author;
    }
    public void setPrice(Double price){
        this.Price = price;
    }
    public Integer getBookNumber(){
        return this.bookNumber;
    }
    public String getTitle(){
        return this.Title;
    }
    public String getAuthor(){
        return this.Author;
    }
    public Double getPrice(){
        return this.Price;
    }
}