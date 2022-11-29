package Week48;

public abstract class Computer {
	// three properties
	private String deviceName;
	private int price;
	private String RAM;
	
	public boolean hasHDMI=true;
	
	//no arg constructor
	public Computer() {
		//System.out.println("Inside the Computer(Parent) class constructor.");
	}

	
	// getters and setters for the properties
	public void setName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	public String getName() {
		return this.deviceName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setMemory(String memory) {
		this.RAM = memory;
	}
	
	public String getMemory() {
		return this.RAM;
	}
	
	// method #1
	public void hasHDMI() {
		if(hasHDMI==true) {
		System.out.println("Has HDMI port.");
		}else {
			System.out.println("No HDMI port.");
		}
		
	}
	
	// method #2
	public void deviceDetails() {
		System.out.println("The device "+ this.deviceName + " costs: " + this.price+ " and has a memory of: "+ this.RAM);
	}
	
	// an abstract class must have abstract method
	public abstract void inputDevices();
	
}
