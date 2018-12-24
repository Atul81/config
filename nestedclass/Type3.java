package nestedclass;

public class Type3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticOuter.Inner inner = new staticOuter.Inner();
		inner.func();
		staticOuter.Inner.staticFun();
		System.out.println(staticOuter.Inner.c);
		inner.func();
	}

}

class staticOuter{
	static class Inner {
		
		static int c =6;
		void func() {
			System.out.println("Hello");
			System.out.println(c);
		}
		
		static void staticFun() {
			System.out.println("static Hello");
		}
	}
}
