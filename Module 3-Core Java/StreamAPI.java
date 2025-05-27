import java.util.*;
import java.util.stream.*;
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evens = list.stream().filter(x -> x%2==0).collect(Collectors.toList());
        for(int x : evens) System.out.println(x);
    }
}

