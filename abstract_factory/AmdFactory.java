package abstract_factory;

public class AmdFactory implements CpuFactory{

	@Override
	public Cpu produceCpu() {
		return new AmdCpu();
	}

}
