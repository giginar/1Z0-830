package section11_annotations;

import java.lang.annotation.*;

public class CreatingCustomAnnotation {
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
    String level() default "INFO";
}

// 🔹 @interface defines a custom annotation
// 🔹 The level() element acts like a configurable property

