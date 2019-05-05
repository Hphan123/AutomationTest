package Question2;


public class MyThread extends Thread {
	private Car car;
	
	public MyThread(Car car){
		this.car = car;
	}
	
	@Override
	public void run() {
		car.run();
	}
}