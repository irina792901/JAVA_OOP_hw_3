package data.comparator;

import data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {

    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        int o11 = o1.getStudentGroupList().size();
        int o22 = o2.getStudentGroupList().size();
        return Integer.compare(o11, o22);
    }
}
