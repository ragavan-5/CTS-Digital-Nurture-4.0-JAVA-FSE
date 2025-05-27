import java.util.HashMap;
import java.util.Scanner;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            map.put(id, name);
        }
        int searchId = sc.nextInt();
        System.out.println(map.get(searchId));
    }
}

