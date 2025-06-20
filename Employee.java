public class Employee {
    private String name;
    private int hours;

    public Employee(){
        this.name = "";
        this.hours = 0;
    }

    public Employee(String name, int hours){
        this.name = name;
        this.hours = hours;
    }

    public double calculateSalary(){
        return hours * 20;
    }

    public int getHours(){
        return hours;
    }
}
