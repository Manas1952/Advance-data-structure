package HashTables;

import java.util.IdentityHashMap;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Map<String, Employee> hashMap = new IdentityHashMap<>();

        Employee employee = new Employee("mno");

        hashMap.put("a", new Employee("abc"));
        hashMap.put("aa", new Employee("def"));
        hashMap.put("aaa", new Employee("ghi"));
        hashMap.put("bb", new Employee("jkl"));
        hashMap.put("c", employee);

        hashMap.putIfAbsent("a", employee);

        System.out.println(hashMap.containsKey("a"));
        System.out.println(hashMap.containsValue(employee));

        hashMap.remove("a");

        hashMap.forEach((key, value) -> {
            System.out.println(key + " : " + value.name);
        });
        System.out.println();

        System.out.println(hashMap.getOrDefault("none", new Employee("defaultEmployee")).name);
    }
}
