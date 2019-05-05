package Question1;

public class Program {
	public static void main(String[] args) {
        Car toyota = new Car();
        Car bmw = new Car();
        
        toyota.setMaxSpeed(100);
        bmw.setMaxSpeed(200);
        
        toyota.run();        
        bmw.run();
    }
}
