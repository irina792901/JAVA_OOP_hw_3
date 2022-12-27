package data.iterator;

import data.Student;
import data.StudentGroup;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private final StudentGroup studentGroup;
    private Iterator<Student> students;


    public StudentGroupIterator(StudentGroup studentGroup, Iterator<Student> students) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudentList().iterator();
    }

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return this.students.hasNext();
    }

    @Override
    public Student next() {//Object если использовать cursor
        return this.students.next();
    }

    @Override
    public void remove() {
        this.students.remove();
    }
}
//    private List<Student> students;
//    private int cursor;

// public StudentGroupIterator(StudentGroup studentGroup) {
//        this.students = studentGroup.getStudentList();
//    }
//    @Override
//    public boolean hasNext() {
//        return cursor < students.size();
//    }
//    @Override
//    public Student next() {//Object если использовать cursor
//        return students.get(cursor++);//сначала получаем get(cursor), потом прибавляем 1 к курсору
//    }
//    @Override
//    public void remove() {
//        this.students.remove(cursor);
//    }



