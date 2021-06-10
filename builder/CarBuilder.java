package builder;

interface CarBuilder {
	public CarBuilder buildBodyStyle();
	public CarBuilder buildPower();
	public CarBuilder buildEngine();
	public Car getCar();
};