package data.iterator;

import data.GroupStream;
import data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private int cursor;
    private final GroupStream groupStream;
    private final List<StudentGroup> studentGroupList;

    public GroupStreamIterator(GroupStream groupStream) {
        this.groupStream = groupStream;
        this.studentGroupList = groupStream.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return cursor < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroupList.get(cursor++);
    }

    @Override
    public void remove() {
        studentGroupList.remove(cursor);
    }
}
