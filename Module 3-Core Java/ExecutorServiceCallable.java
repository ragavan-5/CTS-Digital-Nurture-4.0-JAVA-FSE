import java.util.*;
import java.util.concurrent.*;
public class ExecutorServiceCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(3);
        List<Callable<Integer>> tasks = new ArrayList<>();
        for(int i=1; i<=5; i++) {
            int x = i;
            tasks.add(() -> x*x);
        }
        List<Future<Integer>> results = es.invokeAll(tasks);
        for(Future<Integer> f : results) System.out.println(f.get());
        es.shutdown();
    }
}
