
package com.cbfacademy;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;
import java.io.BufferedWriter;

public class ExcerciseClient {
    // a ExerciseClient class which requests a connection to server, sends a simple
    // text message to the server.
    public static void main(String[] args) {
        try {
            // requests a connection to server
            Socket socket = new Socket("localhost", 4040);
            // send message
            String message;
            OutputStream message = socket.getOutputStream();

        } catch (UnknownHostException ue) {
            System.out.println(ue.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
