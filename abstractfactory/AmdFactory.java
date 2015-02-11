package abstractfactory;

public class AmdFactory implements CpuFactory{

	@Override
	public Cpu produceCpu() {
		return new AmdCpu();
	}

}
