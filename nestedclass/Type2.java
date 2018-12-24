package nestedclass;

public class Type2 {
	public static void main(String ar[]) {
		Outer.Inner inner = new Outer().new Inner();
		inner.func();
		
		Outer outer = new Outer();
		Outer.Inner inner2 = outer.new Inner();
		inner2.func();
	}
}

class Outer {
	class Inner {
		void func() {
			System.out.println("Inner  Class");
		}
	}
}
