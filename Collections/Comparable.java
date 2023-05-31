package Collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements java.lang.Comparable<Student> {
    int age;

    Student(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        if (student.age == age) {
            return 0;
        }
        else if (student.age < age) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

public class Comparable {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(new Student(22));
        arrayList.add(new Student(19));
        arrayList.add(new Student(20));
        arrayList.add(new Student(32));
        arrayList.add(new Student(15));

        Collections.sort(arrayList);

        for (Student student: arrayList) {
            System.out.println(student.age);
        }


    }
}
