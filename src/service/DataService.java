package service;

import data.StudentGroup;
import data.User;

public interface DataService <U extends User>{//здесь 2 абстрактных метода
    void create(User user);
    User read(User user);
    StudentGroup getGroup();
    StudentGroup getGroup(int number);
    void removeStudent(String firstName,String lastName);
    void sortUsers(StudentGroup studentGroup);
    void sortUsersByName(StudentGroup studentGroup);
}
