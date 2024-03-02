package Collections;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    int rollNo;
    double attendance;
    String name;
    int age;

    Student(int rollNo , double att, String b, int age){
        this.rollNo = rollNo;
        this.attendance = att;
        this.name = b;
        this.age = age;
    }

    // by default we want to sort on the basis of desc order of roll no
    @Override
    public int compareTo(Student o) {
        // this , o
        // this object to come first in the result -> return -1
        // o object to come first -> return 1
        // equal -> return 0
        if(this.rollNo > o.rollNo){
            return -1;
        } else if (o.rollNo > this.rollNo){
            return 1;
        }
        return 0;
    }
}
