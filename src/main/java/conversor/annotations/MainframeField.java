package src.main.java.conversor.annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MainframeField {
    int order() default 0;
    int length() default 0;
}
