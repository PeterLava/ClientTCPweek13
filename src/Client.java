import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) throws IOException {
        Socket c1 = new Socket("localhost", 4999);
        PrintWriter printWriter = new PrintWriter(c1.getOutputStream());
        InputStreamReader inputStreamReader = new InputStreamReader(c1.getInputStream());
        InputStreamReader inputstring = new InputStreamReader(System.in);
        BufferedReader bufferedReaderscanner = new BufferedReader(inputstring);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        while(true) {

                if(bufferedReader.ready()){
                    String input1 = bufferedReader.readLine();
                    System.out.println(input1);
                }
                if(bufferedReaderscanner.ready()){
                   String message = bufferedReaderscanner.readLine();
                    printWriter.println(message);
                    printWriter.flush();
                }
        }
    }
}
