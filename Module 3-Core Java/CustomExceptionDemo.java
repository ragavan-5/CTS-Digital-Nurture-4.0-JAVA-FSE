import java.util.Scanner;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if(age < 18) throw new InvalidAgeException("Invalid Age");
            System.out.println("Valid Age");
        } catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

