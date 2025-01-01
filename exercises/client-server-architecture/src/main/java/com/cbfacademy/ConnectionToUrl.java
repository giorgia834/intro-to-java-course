package com.cbfacademy;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.io.BufferedReader;

public class ConnectionToUrl {
    public static void main(String[] args) {
        try {
            String line;
            URL myURL = new URI("https://codingblackfemales.com/").toURL();
            BufferedReader br = new BufferedReader(new InputStreamReader(myURL.openStream()));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (URISyntaxException e) {
            System.out.println(e);
        } catch (MalformedURLException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
