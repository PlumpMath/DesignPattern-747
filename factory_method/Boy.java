package factory_method;

public class Boy implements Human {

	@Override
	public void walk() {
		System.out.println("Boy is walking");
	}

	@Override
	public void talk() {
		System.out.println("Boy is talking");
	}

}
