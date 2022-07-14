package Legacy;

public class Aspirant extends Student {
    String sciencejob;
    double averageMark = 5;
    public Aspirant (String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
        this.sciencejob = sciencejob;
        this.averageMark = averageMark;
        if (averageMark == 5) {
            Scholarship = 200;
        } else {
            Scholarship = 180;
        }
        int getScholarship () {
            return this.Scholarship;;
    }
}}
