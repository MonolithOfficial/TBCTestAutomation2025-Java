package ge.tbc.testautomation.annotationsAndStreams_L10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Marked {
    int id();
    String title() default "Default Marking";
}
