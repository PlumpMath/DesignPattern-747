package proxy;

public class RealSinger implements Singer {

	@Override
	public void sing() {
		System.out.println("Singing in a Live Show");
	}

}
