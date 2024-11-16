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
    
    public String toString(){
        return "Hello I am " + name + " and " + 
        " I lived in " + address + ".";
    }
}
