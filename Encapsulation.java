public class Encapsulation {
          public static void main(String[] args){
          
              Student stu1 = new Student();
              stu1.setId(2311646);
              stu1.setName(" MicaJoyce Biadoy");
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