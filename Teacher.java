public class Teacher extends Person{
    private String mySubject;
    private int mySalary;
    // TODO: Add fields.

    public Teacher(String name, int age, String gender, String subject, int salary)
    {
        super(name, age, gender);

        mySubject = subject;
        mySalary = salary;
    }

    // TODO Add methods

    public String getSubject() {
        return mySubject;
    }

    public int getSalary() {
        return mySalary;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public void setSalary(int salary) {
        mySalary = salary;
    }

    public String toString(){
        // TODO: improve this.
        return super.toString() + ", teaching " + mySubject + " , paid: " + mySalary;
    }
}
