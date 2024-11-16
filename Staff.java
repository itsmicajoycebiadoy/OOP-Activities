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
    @Override
    public String toString(){
        return " Hello I am the staff of " + school + " and I have a salary of " + salary + ".";
    }
    
}