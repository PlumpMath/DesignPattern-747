package factory_method;

public class Girl implements Human {

	@Override
	public void walk() {
		System.out.println("Girl is walking");
	}

	@Override
	public void talk() {
		System.out.println("Girl is talking");
	}

}
