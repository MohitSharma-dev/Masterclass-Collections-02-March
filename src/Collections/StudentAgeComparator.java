package Collections;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // if o1 should comes first -> return -1;
        if(o1.age < o2.age){
            return -1;
        } else if (o1.age > o2.age){
            return 1;
        }
        return 0;
    }
}
