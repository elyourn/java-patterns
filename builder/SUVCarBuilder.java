package builder;

public class SUVCarBuilder implements CarBuilder {
	private Car car = new Car(CAR_TYPES.SUV);

	@Override
	public CarBuilder buildBodyStyle() {
		car.setBodyStyle(
				"Автомобиль происходящий изначально из класса внедорожников, но используемый в подавляющем большинстве случаев в городах и на асфальтированной дороге.");
		return this;
	}

	@Override
	public CarBuilder buildPower() {
		car.setPower("277 л.с.");
		return this;
	}

	@Override
	public CarBuilder buildEngine() {
		car.setEngine("2.2 л Бензиновый");
		return this;
	}

	@Override
	public Car getCar() {
		return car;
	}
}
