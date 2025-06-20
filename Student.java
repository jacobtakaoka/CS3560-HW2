public class Student {

    private String name;
    private String major;
    private double gpa;

    public Student(){
        name = "";
        major = "";
        gpa = 0.0;
    }

    public Student(String name, String major){
        this.name = name;
        this.major = major;
    }

    public Student(String name, String major, double gpa){
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String m){
        major = m;
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double g){
        gpa = g;
    }

    public String toString(){
        return String.format("Name: %s \n Major: %s \n GPA: %.2f", name, major, gpa);
    }

    public boolean equals(Object obj){
        boolean status;

        if(name == major){
            status = true;
        }else{
            status = false;
        }
        return status;
    }

}
