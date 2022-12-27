package service;

import data.Student;
import data.StudentGroup;
import data.User;
import repository.StudentRepository;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentServiceImpl implements DataService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
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

    public void saveStudent(Student entity) {
        studentRepository.save(entity);
    }

    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    public Student findByFio(String lastName, String firstName) {
        return studentRepository.findByFio(lastName, firstName);
    }
}
