import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4999);
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        InputStreamReader serverInput = new InputStreamReader(socket.getInputStream());
        BufferedReader serverReader = new BufferedReader(serverInput);
        InputStreamReader userInput = new InputStreamReader(System.in);
        BufferedReader userReader = new BufferedReader(userInput);
        while(true) {
                if(serverReader.ready()){
                    String input1 = serverReader.readLine();
                    System.out.println(input1);
                }
                if(userReader.ready()){
                    String message = userReader.readLine();
                    printWriter.println(message);
                    printWriter.flush();
                }
        }
    }
}
