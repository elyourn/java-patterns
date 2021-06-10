package builder;

/**
 * Task: Паттерн Builder. Разработать модель системы Автомобиль. Написать код
 * приложения, который будет позволять порождать как серийные автомобили, так и
 * автомобили по специальному заказу. Использовать шаблон.
 */

enum CAR_TYPES {
	SEDAN, SUV
}

public class Main {
	public static void main(String[] args) {
		CarBuilder carBuilder = new SedanCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		Car car = director.build();
		System.out.println(car);

		carBuilder = new SUVCarBuilder();
		director = new CarDirector(carBuilder);
		car = director.build();
		System.out.println(car);
	}
}