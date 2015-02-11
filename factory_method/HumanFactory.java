package factory_method;

public class HumanFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Human boy = createHuman("boy");
		boy.walk();
		boy.talk();

		Human girl = createHuman("girl");
		girl.walk();
		girl.talk();
	}

	private static Human createHuman(String type) {
		if (type.equalsIgnoreCase("boy")) return new Boy();
		if (type.equalsIgnoreCase("girl")) return new Girl();
		return null;
	}

}
