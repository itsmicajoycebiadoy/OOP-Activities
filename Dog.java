class Dog{
    String name;
    int numberOfPuppies;
    boolean isMale;
    String[] listOfPuppies;
  
    public void setName(String thisName){
      name = thisName;
    }

    public String showName(){
      return name;
    }

    public void bark(){
      System.out.println("woof! woof!");
    }  
 
    public void setNumberOfPuppies(int numOfPuppies){
      numberOfPuppies = numOfPuppies;
    }

    public int showNumOfPuppies(){
        return numberOfPuppies;
    }
 
    public void setListOfPuppies(String[] puppies){
      listOfPuppies = puppies;
    }
  
    public void showPuppies(){
      for(int i = 0; i < listOfPuppies.length; i++){
        System.out.println("The Puppie's Name is "+ listOfPuppies[i]);
      }
    }
  }
  
  