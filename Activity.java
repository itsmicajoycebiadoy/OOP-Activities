public class Activity{

    public static void main(String[] args){
 
      Dog petDog = new Dog();
      Dog petDog1 = new Dog();

      petDog.setName("Miles");
      petDog1.setName("Silvania");

      System.out.println(petDog.showName());
      System.out.println(petDog1.showName());
      System.out.println();
  
      petDog.isMale = true;
      petDog1.isMale = true;

      System.out.println(petDog.showName() + " is a Male: " + petDog.isMale);
      System.out.println(petDog1.showName() + " is a Male: " + petDog1.isMale);
      System.out.println();
  
      petDog.bark();
      petDog1.bark();
      System.out.println();
  
      petDog.setListOfPuppies(new String[] {"Ace","Alice","Ale","Sage"});
      petDog1.setListOfPuppies(new String[] {"Dolly","Doria","Shiro","Tofu","Cinnamon"});

      petDog.setNumberOfPuppies(4);
      petDog1.setNumberOfPuppies(5);
      
      System.out.println("Puppies under " + petDog.showName() + " : " + petDog.showNumOfPuppies());
      petDog.showPuppies();
      System.out.println();
 
      System.out.println("Puppies under " + petDog1.showName() + " : " + petDog1.showNumOfPuppies());
      petDog1.showPuppies();
      System.out.println();
    }
  }
  
  