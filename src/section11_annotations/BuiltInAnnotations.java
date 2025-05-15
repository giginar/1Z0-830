package section11_annotations;

public class BuiltInAnnotations {

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    @Override
    public String toString() {
        return "Overridden toString method";
    }

    @SuppressWarnings("unchecked")
    public void doUnsafeCast() {
        Object rawList = new java.util.ArrayList();
        java.util.List<String> safeList = (java.util.List<String>) rawList;
    }
    // 🔹 @Deprecated, @Override, @SuppressWarnings are commonly used and tested.
}

