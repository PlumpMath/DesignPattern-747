package singleton;

public class Singleton {
	private static Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	public void doSomething() {
		System.out.println("fofofo");
	}

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.doSomething();
	}

}
