import java.util.Scanner;
public class Calculator {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    public void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }
    public void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        Calculator calculator = new Calculator();
        calculator.add(a,b);
        calculator.subtract(a,b);
        calculator.multiply(a,b);
        calculator.divide(a,b);
       
    }
}
