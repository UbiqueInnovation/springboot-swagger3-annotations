package ch.ubique.openapi.docannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.type.NullType;

import java.lang.annotation.ElementType;
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.TYPE_PARAMETER, ElementType.PARAMETER, ElementType.FIELD, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Documentation {
    String description() default "";
    String example() default "";
    String[] responses() default {};
    boolean undocumented() default false;
    Class<?> serializedClass() default NullType.class ;
} 
