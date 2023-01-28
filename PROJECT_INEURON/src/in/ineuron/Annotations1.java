package in.ineuron;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// the usage of @Override is suppose if we annotate a method which we taught it is overriden one 
// but actually not then by annotating with @override it gives error.


@Target({ElementType.TYPE,ElementType.METHOD}) // these are enums 
@Retention(RetentionPolicy.RUNTIME)
@interface Meee
{
	String name() default "shiva";
	
}

@Meee(name="Shiva")
public class Annotations1 {

public static void main(String[] args) {
	
	Annotations1 a= new Annotations1();
	
	Class c= a.getClass();
	Annotation n=c.getAnnotation(Meee.class);
	Meee e=(Meee)n;
	System.out.println(e.name());
}
}
