public class CollegeStudent extends Student {
    private int myYear;
    private String myMajor;

    public CollegeStudent(String name, int age, String gender,
    String idNum, double gpa, int year, String major) {

        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    public int getYear() {
        return myYear;
    }

    public String getMajor() {
        return myMajor;
    }

    public void setYear(int year) {
        myYear = year;
    }

    public void setMajor(String major) {
        myMajor = major;
    }

    public String toString(){
        return super.toString() + ", class of: " + myYear + ", studying: " + myMajor;
    }
}