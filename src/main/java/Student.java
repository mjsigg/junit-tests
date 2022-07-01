import java.util.ArrayList;

public class Student {
    protected long id;
    String name;
    ArrayList<Integer> grades;

    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double average;
        grades = getGrades();
        double sum = 0;
        var length = grades.size();
        for(var i: grades) {
            sum = grades.get(i) + sum;
        }

        return sum / length;
    }

}
