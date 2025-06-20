public class Professor extends Employee{
    private String field;

    public Professor(String field){
        super();
        this.field = field;
    }

    public double calculateSalary(){
        return getHours() * 30;
    }
}
