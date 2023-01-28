package in.ineuron;

import java.util.stream.Stream;

// we can also use stream on primitives not only on collection objects
public class PrimitiveStream {
public static void main(String[] args) {
	
	Stream s =Stream.of(1,2,3,4,5);
	s.forEach((n)-> System.out.println(n));
	
}
}
