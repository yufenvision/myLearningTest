package myTest.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider {
	
	int id() default -1;
	
	String name() default "";
	
	String address() default "";
}
