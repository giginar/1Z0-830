package section11_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(Tags.class)
@interface Tag {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Tags {
    Tag[] value();
}

public class RepeatableAnnotations {

    @Tag("unit")
    @Tag("performance")
    public void testMethod() {
        System.out.println("Running test...");
    }
}

class ReadingRepeatableAnnotations {
    public static void main(String[] args) throws Exception {
        Method method = RepeatableAnnotations.class.getDeclaredMethod("testMethod");

        Tag[] tags = method.getAnnotationsByType(Tag.class);
        for (Tag tag : tags) {
            System.out.println("Tag: " + tag.value());
        }
    }
}
