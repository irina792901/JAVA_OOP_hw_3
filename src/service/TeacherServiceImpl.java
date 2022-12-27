package service;

import data.StudentGroup;
import data.User;
import repository.TeacherRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class TeacherServiceImpl implements DataService{
    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }

    @Override
    public StudentGroup getGroup() {
        return null;
    }

    @Override
    public StudentGroup getGroup(int number) {
        return null;
    }

    @Override
    public void removeStudent(String firstName, String lastName) {

    }

    @Override
    public void sortUsers(StudentGroup studentGroup) {

    }

    @Override
    public void sortUsersByName(StudentGroup studentGroup) {

    }
}
