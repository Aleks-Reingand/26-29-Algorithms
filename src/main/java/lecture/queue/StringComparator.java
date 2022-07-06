package lecture.queue;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.charAt(0) < s2.charAt(0)){
            return 1;
        } else if (s1.charAt(0) > s2.charAt(0)) {
            return -1;
        }
        return 0;
    }
}
