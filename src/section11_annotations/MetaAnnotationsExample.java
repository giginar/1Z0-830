package section11_annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MetaAnnotationsExample {
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@interface Trackable {
    String value();
}

// 🔹 @Target: Where annotation can be used (method, field, class, etc.)
// 🔹 @Retention: Controls whether it’s available at runtime, compile-time, or not at all
// 🔹 @Inherited: Annotation is inherited by subclasses (only works on class-level)
// 🔹 @Documented: Shows up in Javadoc
