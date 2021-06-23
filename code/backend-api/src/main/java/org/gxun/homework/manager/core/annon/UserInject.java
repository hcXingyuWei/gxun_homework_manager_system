package org.gxun.homework.manager.core.annon;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface UserInject {

    int index() default 0;

    boolean required() default true;

    String [] ids() default {"userId"};

    String [] names() default {"userName"};
}
