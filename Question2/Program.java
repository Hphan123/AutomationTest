package Question2;


public class Program {
	public static void main(String[] args) {
        Car toyota = new Car();
        Car bmw = new Car();
        
        toyota.setMaxSpeed(100);        
        bmw.setMaxSpeed(200);
        
        MyThread thread1 = new MyThread(toyota);
        MyThread thread2 = new MyThread(bmw);
        thread1.start();
        thread2.start();
    }
}