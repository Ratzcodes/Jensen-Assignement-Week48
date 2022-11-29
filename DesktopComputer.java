package Week48;

public class DesktopComputer extends Computer {

	private String type= "Super"; // Super, Mainframe, Mini, and Micro Computer
	
	public DesktopComputer () {
		System.out.println("Constructor of a DesktopComputer(child) class.");
	}
	
	public DesktopComputer (String type) {
		this.type = type;
	}
	
	public void Maintainence() {
		System.out.println("Easy Maintainence");
	}
	
	// setter an d getters for type property
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void type(){
		System.out.println("DesktopComputer of type: " + this.getType());
	}
	
	@Override
	public void inputDevices(){
		System.out.println("Many input devices can be connected to the dektop computers");
		
	}
	

}
