package co.g2academy.url;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://vidio.com");
            URLConnection connection = url.openConnection();
            InputStream in = connection.getInputStream();
            int i;
            while ((i = in.read()) !=-1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
