package com.cbfacademy;

import java.io.IOException;
import java.net.*;

public class ExerciseServer {
    public static void main(String[] args) {
        int port = -4040;

        try {

            InetAddress inetAddress = InetAddress.getByName("localhost");
            ServerSocket ServerSocket = new ServerSocket(4040);
            // accept connection
            Socket Socket = ServerSocket.accept();
            SocketAddress SocketAddress = new InetSocketAddress(inetAddress, port);
            ServerSocket.bind(SocketAddress);
            System.out.println("Server connection exercise");
            ServerSocket.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // receive message from client
        // print message from client

    }

}
