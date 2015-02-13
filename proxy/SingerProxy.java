package proxy;

public class SingerProxy implements Singer {

	private Singer realSinger;
	@Override
	public void sing() {
		signContract();
		realSinger.sing();
	}
	private void signContract() {
		System.out.println("sign a new contract");
	}

	public SingerProxy() {
		this.realSinger = new RealSinger();
	}
	
	public static void main(String[] args) {
		Singer proxy = new SingerProxy();
		proxy.sing();
	}
}
