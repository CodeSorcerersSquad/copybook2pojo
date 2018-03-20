package conversor.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MainframeFiller {
    int beforeOrder() default 0;
    int afterOrder() default 0;
    int length() default 0;
    char fillerChar() default ' ';
}
