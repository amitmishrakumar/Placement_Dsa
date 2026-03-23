
import java.util.HashMap;

public class basic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("amit", 10);
        map.put("b", 11);
        System.out.println(map.size());
        System.out.println(map.remove("amit"));
         System.out.println(map.size());
    };
};
