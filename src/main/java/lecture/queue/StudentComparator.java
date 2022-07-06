package lecture.queue;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getLevel() < s2.getLevel()){
            return 1;
        } else if (s1.getLevel() > s2.getLevel()) {
            return -1;
        }
        return 0;
    }
}
