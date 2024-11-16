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

