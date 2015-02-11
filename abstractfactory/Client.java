package abstractfactory;

public class Client {

	public static void main(String[] args) {
		Computer intelComputer = getComputer(1);
		Computer amdComputer = getComputer(2);
	}

	private static Computer getComputer(int i) {
		switch(i) {
			case 1: {
				return new Computer(new IntelFactory()); 
			}
			case 2: {
				return new Computer(new AmdFactory());
			}
		}
		return null;
	}

}
