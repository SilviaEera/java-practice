package socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class ReverseEcho {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(2000);

            // when client tries to connect the accept method will accept the connection
            Socket sk = ss.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            // PrintStream ps = new PrintStream(br);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}