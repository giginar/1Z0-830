package section12_security;

import java.security.MessageDigest;
import java.util.Arrays;

public class BasicCryptoExample {
    public static void main(String[] args) throws Exception {
        String input = "myPassword123";

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(input.getBytes());

        System.out.println("Hashed: " + Arrays.toString(hash));
    }
    // ✅ MessageDigest supports SHA-1, SHA-256, MD5 (avoid MD5 in real apps).
}

