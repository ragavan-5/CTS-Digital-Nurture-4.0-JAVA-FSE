import java.lang.reflect.Method;

public class ReflectionDemo {
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
    
    public static void main(String[] args) throws Exception {
        Class<?> clazz = ReflectionDemo.class;
        Object instance = clazz.getDeclaredConstructor().newInstance();
        for (Method method : clazz.getDeclaredMethods()){
            System.out.println("Method: " + method.getName());
            if (method.getName().equals("greet")) {
                method.invoke(instance, "World");
            }
        }
    }
}