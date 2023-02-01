import java.util.HashMap;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("apple", "яблоко");
        myHashMap.put("one", "function");

        Set<String> keySet = myHashMap.keySet();
        for (String key : keySet) {
            System.out.print(key + ": ");
            System.out.println(myHashMap.get(key));
        }
    }
}
