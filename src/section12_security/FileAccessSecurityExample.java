package section12_security;

import java.io.*;

public class FileAccessSecurityExample {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());

        try {
            var file = new File("secret.txt");
            var writer = new FileWriter(file);
            writer.write("Restricted content");
            writer.close();
        } catch (SecurityException e) {
            System.out.println("SecurityException: File write access denied.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

