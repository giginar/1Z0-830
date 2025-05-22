package section15_records;

sealed interface Response permits Success, Error {}

record Success(String message) implements Response {}
record Error(int code) implements Response {}

public class SwitchOnRecord {
    public static void main(String[] args) {
        Response r = new Success("OK");

        switch (r) {
            case Success s -> System.out.println("Success: " + s.message());
            case Error e -> System.out.println("Error: " + e.code());
        }
    }
}
