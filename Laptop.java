package Week48;

public class Laptop extends Computer {

	// properties
	private String color;
	
	//keeping this property read only
	private int weightInGrams = 2000 ;
	
	// constructor
	public Laptop() {
		System.out.println("This is the Laptop class( child of computer class) constructor");
	}
	
	//parameterized constructor
	public Laptop(String color, int weight) {
		this.color = color;
		this.weightInGrams = weight;
	}
	
	// method of this class
	public void performance() {
		System.out.println("Laptops have a good performance");
	}
	
	// getter and setter for properties
	public void setColor(String color) {
		this.color= color;
	}
	
	public String getColor() {
		return this.color;
		
	}
	public int getWeightInGrams() {
		return this.weightInGrams;
	}
	
		
	@Override
	public void inputDevices() {
		System.out.println("Input device method of the Laptop class");
		
	}

}
