import java.util.HashMap;

public class feqCount {
    public static void main(String[] args) {
         int arrs[] = { 10, 5, 10, 15, 10, 5 };
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int arr : arrs) {
         
         
            if (!map.containsKey(arr)) {
               map.put(arr, 1);
            } else {
                
                   int feq=map.get(arr);
                   map.put(arr, feq+1);
                }
            }
            System.out.println(map);
        }
        
    }

