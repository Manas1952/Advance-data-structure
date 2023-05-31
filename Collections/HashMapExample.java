package Collections;

import java.util.*;

class Student2 {
    int id;

    Student2(int id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object o) {
//        Student2 student2 = (Student2) o;
//        return id == student2.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return id;
//    }
}

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Student2, Integer> hashMap = new HashMap<>();

        System.out.println(hashMap.put(new Student2(1), 11));
        System.out.println(hashMap.put(new Student2(1), 12));
        System.out.println(hashMap.put(new Student2(3), 13));

        System.out.println();
//        System.out.println(hashMap.get(new Student2(1)));

        //////////////////////

//        Iterator iterator = hashMap.keySet().iterator();
//
//        while (iterator.hasNext()) {
//            Student2 student = (Student2) iterator.next();
//            if (3 == (student.id)) {
//                System.out.println("found: " + hashMap.get(student));
//            }
//        }

        ///////////////////////

        Iterator iterator1 = hashMap.entrySet().iterator();

        for(Map.Entry<Student2, Integer> map: hashMap.entrySet()) {
            Student2 student = map.getKey();

            if (3 == student.id) {
                System.out.println("Found: " + hashMap.get(student));
            }
        }

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(null);

        Collections.sort(list);

        Integer[] array = (Integer[])list.toArray(new Integer[2]);
        array[0] = 11;

        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array.length);
    }
}
