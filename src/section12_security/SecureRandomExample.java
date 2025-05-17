package section12_security;

import java.security.SecureRandom;

public class SecureRandomExample {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        byte[] bytes = new byte[16];
        sr.nextBytes(bytes);

        System.out.println("Random bytes: ");
        for (byte b : bytes) {
            System.out.printf("%02x ", b);
        }
    }
    // ✅ SecureRandom should be used instead of java.util.Random for cryptographic purposes.
}

