package com.cbfacademy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class ServerExercise {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(4040);
            Socket socket = serverSocket.accept();
            InputStream message = socket.getInputStream();
            System.out.println(message);
            serverSocket.close();
            // accept connection
            // receive message from client
            // print message from client

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}