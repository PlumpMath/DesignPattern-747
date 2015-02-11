package abstract_factory;

public class Computer {
	private Cpu cpu;
	public Computer(CpuFactory factory) {
		this.cpu = factory.produceCpu();
		this.cpu.process();
	}

}
