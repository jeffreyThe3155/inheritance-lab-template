public class Teacher extends Person{
    private String mySubject;
    private double mySalary;
    // TODO: Add fields.

    public Teacher(String name, int age, String gender, String subject, double salary)
    {
        super(name, age, gender);

        mySubject = subject;
        mySalary = salary;
    }

    // TODO Add methods

    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    public String toString(){
        // TODO: improve this.
        return super.toString() + ", teaching: " + mySubject + ", paid: " + mySalary;
    }
}
