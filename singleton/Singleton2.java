package singleton;

public class Singleton2 {
	private static class Holder {
		public static final Singleton2 instance = new Singleton2();
	}

	public static Singleton2 getInstance() {
		return Holder.instance;
	}

	public void doSomething() {
		System.out.println("lalala");
	}

	public static void main(String[] args) {
		Singleton2 instance = Singleton2.getInstance();
		instance.doSomething();
	}

}
