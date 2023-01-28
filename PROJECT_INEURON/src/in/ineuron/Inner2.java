package in.ineuron;

public class Inner2 {
	private int a = 10;
	static int b = 10;

	public void f() {
		System.out.println("ll");
	}

	class In {
		static final int g=0;
		public void m1() {
			System.out.println("m1" + a + b); // it can have access to instance and static variables also
		}
	}

	public void m2() {
		class H {
			public void m1() {
				System.out.println("m1" + a + b); // it can have access to instance and static variables also
				f();
			}
		}
	}

	class In2 {
		int aa = a;

		public void m1() {
			System.out.println("m1" + a + b); // it can have access to instance and static variables also
			In i = new In(); // we can access the other class variables.
			i.m1();
		}

	}

	static class In3 {
		static int n=0;
		public void m1() {
			System.out.println("m1" + b); // it can have access to instance and static variables also
		}
	}

	public static void main(String[] args) {
		class Inn {
			public void m2() {
				System.out.println("main" + b); // b is able to access because it is static

			}

		}
		Inner2 i = new Inner2(); // but with object we can't access inner class properties
		Inner2.In2 i1 = i.new In2();
		Inn i4 = new Inn();
		i4.m2();
		In3 ip = new In3(); // static class can have static methods and to access them we need to create
		ip.m1();									// object for static class
		ip.m1();

	}
}
