package Collections;

import java.util.ArrayList;
import java.util.Collections;

class Student1 {
    int age;

    Student1(int age) {
        this.age = age;
    }
}

class AgeComparator implements java.util.Comparator<Student1> {
    @Override
    public int compare(Student1 student1, Student1 student2) {
        if (student1.age < student2.age) {
            return -1;
        }
        else if (student1.age > student1.age){
            return 1;
        }
        else  {
            return 0;
        }
    }
}

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Student1> arrayList = new ArrayList<>();

        arrayList.add(new Student1(21));
        arrayList.add(new Student1(23));
        arrayList.add(new Student1(19));
        arrayList.add(new Student1(22));

//        arrayList.sort(new AgeComparator());

//        Collections.sort(arrayList, new AgeComparator());

        for (Student1 student: arrayList) {
            System.out.println(student.age);
        }
    }
}
