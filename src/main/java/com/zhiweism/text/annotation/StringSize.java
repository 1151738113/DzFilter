package com.zhiweism.text.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)  
@Retention(RetentionPolicy.RUNTIME)
public @interface StringSize {
	String message();
	int minvalue() default 0;   //最小长度
    int maxvalue() default 0;   //最大长度
}
