package section14_sealed_classes;

public class SealedSswitchExhaustiveness {
}

sealed interface Result permits Success, Error {}

final class Success implements Result {
    String data;
    Success(String data) { this.data = data; }
}

final class Error implements Result {
    String message;
    Error(String msg) { this.message = msg; }
}

class ResultHandler {
    public static void main(String[] args) {
        Result res = new Success("Hello");

        switch (res) {
            case Success s -> System.out.println("Data: " + s.data);
            case Error e -> System.out.println("Error: " + e.message);
        }
    }
}

// ✅ The compiler ensures all permitted types are handled. If one is missing, you’ll get a compile-time error.

