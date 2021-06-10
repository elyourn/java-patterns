package builder;

public class Car {
	private String bodyStyle;
	private String power;
	private String engine;
	private CAR_TYPES carType;

	public Car(CAR_TYPES carType) {
		this.carType = carType;
	}

	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------------" + carType + "--------------------- \n");
		sb.append(" Body: ");
		sb.append(bodyStyle);
		sb.append("\n Power: ");
		sb.append(power);
		sb.append("\n Engine: ");
		sb.append(engine);

		return sb.toString();
	}
}
