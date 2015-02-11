package abstractfactory;

public class IntelCpu implements Cpu{

	@Override
	public void process() {
		System.out.println("Intel cpu is processing");
	}


}
