package builder;

public class CarDirector {
	private CarBuilder builder;

	public CarDirector(CarBuilder builder) {
			this.builder = builder;
		}

	public Car build() {
		return builder.buildBodyStyle().buildPower().buildEngine().getCar();
	}
}
