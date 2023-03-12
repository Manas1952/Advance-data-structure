package HashTables;

class StoredEmployee {
    String key;
    Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

public class Hashtable1 {

    StoredEmployee[] hashTable;

    Hashtable1() {
        hashTable = new StoredEmployee[10];
    }

    int hashKey(String key) {
        return key.length() % hashTable.length;
    }


    void put(String key, Employee value) {
        int hashedkey = hashKey(key);

        if (occupied(hashedkey)) {
            int stopIndex = hashedkey;
            hashedkey = (hashedkey + 1) % hashTable.length;

            while (occupied(hashedkey) && hashedkey != stopIndex) {
                hashedkey = (hashedkey + 1) % hashTable.length;
            }
        }

        if (occupied(hashedkey)) {
            System.out.println("Sorry, run out of memory...");
        }
        else {
            hashTable[hashedkey] = new StoredEmployee(key, value);
        }
    }

    boolean occupied(int index) {
        return hashTable[index] != null;
    }

    Employee get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }
        else {
            return hashTable[hashedKey].employee;
        }
    }

    int findKey(String key)
    {
        int hashedkey = hashKey(key);

        if (hashTable[hashedkey] != null && hashTable[hashedkey].key.equals(key)) {
          return hashedkey;
        }

        int stopIndex = hashedkey;
        hashedkey = (hashedkey + 1) % hashTable.length;

        while (hashedkey != stopIndex && hashTable[hashedkey] != null && !hashTable[hashedkey].key.equals(key)) {
            hashedkey = (hashedkey + 1) % hashTable.length;
        }

        if (stopIndex == hashedkey) {
            return -1;
        }
        else  {
            return hashedkey;
        }
    }

    void print() {
        for (int iterator = 0; iterator < hashTable.length; iterator++) {

            if (hashTable[iterator] != null) {
                System.out.println(hashTable[iterator].employee.name);
            }
        }
    }

    public static void main(String[] args) {
        Hashtable1 hashtable = new Hashtable1();

        hashtable.put("a", new Employee("abc"));
        hashtable.put("aa", new Employee("def"));
        hashtable.put("aaa", new Employee("ghi"));
        hashtable.put("bb", new Employee("jkl"));
        hashtable.put("c", new Employee("mno"));

        hashtable.print();

        System.out.println(hashtable.get("c").name);
    }
}
