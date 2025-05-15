package section11_annotations;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) {
        for (Method method : CreatingCustomAnnotation.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Log level: " + annotation.level());
            }
        }
    }
}

