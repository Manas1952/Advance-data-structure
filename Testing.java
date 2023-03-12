import java.util.HashMap;

public class Testing {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put(1, "Manas");

        System.out.println(hashMap.put(1, "Purohit"));
        System.out.println(hashMap);

        hashMap.putIfAbsent(1, "Manas");
        System.out.println(hashMap);


    }
}
