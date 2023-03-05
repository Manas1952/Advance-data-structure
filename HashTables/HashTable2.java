package HashTables;

import java.util.LinkedList;
import java.util.ListIterator;

//class StoredEmployee2 {
//    String key;
//    Employee employee;
//
//    public StoredEmployee2(String key, Employee employee) {
//        this.key = key;
//        this.employee = employee;
//    }
//}

public class HashTable2 {
    private LinkedList<StoredEmployee>[] hashtable;

    HashTable2() {
        hashtable = new LinkedList[10];

        for (int iterator = 0; iterator < hashtable.length; iterator++) {
            hashtable[iterator] = new LinkedList<StoredEmployee>();
        }
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        hashtable[hashedKey].push(new StoredEmployee(key, employee));
    }

    Employee get(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();

        StoredEmployee storedEmployee;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            if (storedEmployee.key.equals(key)) {
                return storedEmployee.employee;
            }
        }
        return null;
    }

    Employee remove(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();

        StoredEmployee storedEmployee = null;
        int index = -1;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            index++;
            if (storedEmployee.key.equals(key)) {
                break;
            }
        }
        if (storedEmployee == null) {
            return null;
        }
        hashtable[hashedKey].remove(index);
        return storedEmployee.employee;
    }

    void print() {
        for (int iteartor = 0; iteartor < hashtable.length; iteartor++) {
            if (hashtable[iteartor].isEmpty()) {
                System.out.println("Position i: " + iteartor + "empty");
            }
            else {
                ListIterator<StoredEmployee> iterator = hashtable[iteartor].listIterator();

                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee.name + " -> ");
                }
                System.out.println("null");
            }
        }
    }

    public static void main(String[] args) {
        HashTable2 hashtable = new HashTable2();

        hashtable.put("a", new Employee("abc"));
        hashtable.put("aa", new Employee("def"));
        hashtable.put("aaa", new Employee("ghi"));
        hashtable.put("bb", new Employee("jkl"));
        hashtable.put("c", new Employee("mno"));

        hashtable.remove("bb");

        hashtable.print();

        System.out.println(hashtable.get("c").name);
    }
}
