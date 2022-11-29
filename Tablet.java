package Week48;

public class Tablet extends Computer {
	// additional property
	private String screenSize;
	
	//constructor
	public Tablet(){
		System.out.println("No arg constructor of the Tablet(Child) class.");
	}
	
	// getter and setters
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	
	public String getScreenSize() {
		return this.screenSize;
	}
	
	// additional method 
	public void advantages() {
		System.out.println("Tablets are suitable to use by children for the screen size, protability and sound.");
	}
	
	//abstract method from parent class overridden
	@Override
	public void inputDevices() {
		System.out.println("Tablet has port for headphone and charging though USB cable.");
		
	}

}
