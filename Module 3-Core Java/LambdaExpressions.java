import java.util.*;
public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cherry");
        list.sort((a,b) -> a.compareTo(b));
        for(String s : list) System.out.println(s);
    }
}

