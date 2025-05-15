package section11_annotations;

public class UsingCustomAnnotation {

    @LogExecutionTime(level = "DEBUG")
    public void serve() {
        System.out.println("Serving...");
    }
}
