public class Main {
    public static final void main(String[] args) {
		System.out.println("Hello World! JDK14");

        A a = new A();
        a.b().c().d();
	}

    static class A {
        public A b() {
            return A.this;
        }

        public C c() {
            return null;
        }
    }

    static class C {
        public void d() {
            System.out.println("C.d");
        }
    }
}
