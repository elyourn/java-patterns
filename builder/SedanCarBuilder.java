package builder;

public class SedanCarBuilder implements CarBuilder {
	private Car car = new Car(CAR_TYPES.SEDAN);

	@Override
	public CarBuilder buildBodyStyle() {
		car.setBodyStyle(
				"Закрытый кузов легкового автомобиля с багажником, структурно отделённым от пассажирского салона");
		return this;
	}

	@Override
	public CarBuilder buildPower() {
		car.setPower("82/102/113 л.с.");
		return this;
	}

	@Override
	public CarBuilder buildEngine() {
		car.setEngine("1.6 л Бензиновый");
		return this;
	}

	@Override
	public Car getCar() {
		return car;
	}
}
