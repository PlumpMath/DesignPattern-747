package builder;

public class Cellphone {
	String brand;
	int numbOfCpu;
	int sizeOfRam;
	String system;
	float sizeOfScreen;
	int pixelsOfCamera;

	public static class CellphoneBuilder {
		String brand;
		int numbOfCpu;
		int sizeOfRam;
		String system;
		float sizeOfScreen;
		int pixelsOfCamera;

		public CellphoneBuilder setBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public CellphoneBuilder setNumbOfCpu(int numbOfCpu) {
			this.numbOfCpu = numbOfCpu;
			return this;
		}

		public CellphoneBuilder setSizeOfRam(int sizeOfRam) {
			this.sizeOfRam = sizeOfRam;
			return this;
		}

		public CellphoneBuilder setSystem(String system) {
			this.system = system;
			return this;
		}

		public CellphoneBuilder setSizeOfScreen(float sizeOfScreen) {
			this.sizeOfScreen = sizeOfScreen;
			return this;
		}

		public CellphoneBuilder setPixelsOfCamera(int pixelsOfCamera) {
			this.pixelsOfCamera = pixelsOfCamera;
			return this;
		}

		public Cellphone build() {
			return new Cellphone(this);
		}
	}

	public Cellphone(CellphoneBuilder builder) {
		this.brand = builder.brand;
		this.numbOfCpu = builder.numbOfCpu;
		this.pixelsOfCamera = builder.pixelsOfCamera;
		this.sizeOfRam = builder.sizeOfRam;
		this.sizeOfScreen = builder.sizeOfScreen;
		this.system = builder.system;
	}


	@Override
	public String toString() {
		return "Cellphone [brand=" + brand + ", numbOfCpu=" + numbOfCpu + ", sizeOfRam=" + sizeOfRam + ", system="
				+ system + ", sizeOfScreen=" + sizeOfScreen + ", pixelsOfCamera=" + pixelsOfCamera + "]";
	}

	public static void main(String[] args) {
		CellphoneBuilder builder = new CellphoneBuilder();
		Cellphone iPhone = builder.setBrand("Apple").
				setNumbOfCpu(2).
				setPixelsOfCamera(800).
				setSizeOfRam(1024).
				setSizeOfScreen((float) 4.7).
				setSystem("iOS 8").
				build();
		System.out.println(iPhone);
	}

}
