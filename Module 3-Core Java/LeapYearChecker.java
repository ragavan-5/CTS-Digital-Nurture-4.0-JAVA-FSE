import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(leap ? "Leap Year" : "Not a Leap Year");
    }
}