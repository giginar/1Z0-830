package section12_security;

public class SystemSecurityManagerExample {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());

        try {
            System.getProperty("user.home"); // May throw SecurityException
            System.out.println("Access granted to user.home");
        } catch (SecurityException e) {
            System.out.println("Access denied to user.home");
        }
    }
}

