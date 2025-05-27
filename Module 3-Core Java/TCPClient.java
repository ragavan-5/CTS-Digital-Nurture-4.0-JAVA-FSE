import java.io.*;
import java.net.*;
public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = stdin.readLine()) != null) {
            out.println(line);
            System.out.println("Server: " + in.readLine());
        }
        s.close();
    }
}
