package data;

public class Student extends User implements Comparable<Student>{
    private int course;
    private String department;
    private int groupNumber;

    public Student(String firstName, String lastName, int id, int age, int yearOfBirth, int passport, int course, String department, int groupNumber) {
        super(firstName, lastName, id, age, yearOfBirth, passport);
        this.course = course;
        this.department = department;
        this.groupNumber = groupNumber;
    }

    public Student(String firstName) {
        super(firstName);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student student) {
//        if (student.getYearOfBirth() < this.getYearOfBirth()) return 1;
//        if (student.getYearOfBirth() > this.getYearOfBirth()) return -1;
//        else return 0;
        return Integer.compare(this.getYearOfBirth(), student.getYearOfBirth());
    }
}
