package Question1;

public class Car {
	private static final int wheels = 4;
	private static final int doors = 4;
	private static final int seats = 5;
	private int maxSpeed;
	
	public static int getDoors() {
		return doors;
	}
	
	public static int getSeats() {
		return seats;
	}
	
	public static int getWheels() {
		return wheels;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void run() {
		for	(int i = 1; i <= 10; i++){
			System.out.println(maxSpeed);
		}
	}
	
	public void info() {
		System.out.println("wheel = " + wheels);
		System.out.println("door = " + doors);
		System.out.println("seat = " + seats);
		System.out.println("maxSpeed = " + maxSpeed);
	}
}
