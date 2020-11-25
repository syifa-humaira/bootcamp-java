package co.g2academy.properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class AppConfigLoad {

    public static void main(String[] args) {
        Properties pro = new Properties();

        try {
            InputStream in = new FileInputStream("config.properties");

            pro.load(in);

            String server = pro.getProperty("server");
            String port = pro.getProperty("port");
            System.out.println(server);
            System.out.println(port);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
