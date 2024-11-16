public class Book {
          private int BookNumber;
          private String Title;
          private String Author;
          private Double Price;
      
          public void setBookNumber(Integer bookNumber){
              this.BookNumber = bookNumber;
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
              return this.BookNumber;
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