public class Student {
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