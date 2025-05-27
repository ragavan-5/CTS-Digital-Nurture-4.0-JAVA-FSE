import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        FileWriter fw = new FileWriter("output.txt");
        fw.write(s);
        fw.close();
        System.out.println("Data written");
    }
}

