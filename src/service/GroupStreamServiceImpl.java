package service;

import data.GroupStream;
import data.comparator.GroupStreamComparator;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl implements GroupStreamService{
    @Override
    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }
}
