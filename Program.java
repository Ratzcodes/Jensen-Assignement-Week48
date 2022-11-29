package Week48;

public class Program {

	public static void main(String[] args) {
		
		// Cannot create object of Computer as it is an abstract class
		//Computer parentObj = new Computer();

		
/*********************accessing the Desktop class**********************/
		DesktopComputer deskObj = new DesktopComputer();
		System.out.println("Type of first desktop computer is: " + deskObj.getType() +"\n");
		
		System.out.println("Do Desktop computers have HDMI ports? ");
		deskObj.hasHDMI();
		System.out.println();
		
		DesktopComputer deskObj2 = new DesktopComputer("Mainframe");
		System.out.println("Type of second desktop computer is: " + deskObj2.getType());
		
		deskObj.inputDevices();
		
/*********************accessing the laptop class************************/
		// no arg constructor execution
//		Laptop lapObj = new Laptop();
////		lapObj.setColor("Blue");
////		System.out.println("My laptop is "+ lapObj.getColor());
////		// accessing the computer class using laptop object
////		lapObj.setName("Dell");
////		lapObj.setPrice(55000);
////		lapObj.setMemory("64 GB");
////		System.out.println("My laptop details are: ");
////		lapObj.deviceDetails();
//		System.out.println("Weight of the laptop is: " + lapObj.getWeightInGrams()+"\n");
		
//		// parameterized constructor execution
//		Laptop lapObj2 = new Laptop("Pink", 1200);
//		lapObj2.getWeightInGrams();
//		System.out.println("Weight of the second laptop is: " + lapObj2.getWeightInGrams());
		
		
/***********************smartphone implementation*******************************/
//		Smartphone phoneObj = new Smartphone();
//		// constructor will be executed automatically, when object is created
//		phoneObj.inputDevices();	// overrridden method execution
//		phoneObj.setName("Android MI");
//		phoneObj.setMemory("32 GB");
//		phoneObj.setPrice(15000);
//		phoneObj.setCameraPixels("64MP");
//		System.out.println("Camera quality is: " + phoneObj.getCameraPixels());
//		System.out.println("Device details are: ");
//		phoneObj.deviceDetails();
		
		
/*************************tablet class implementation*********************************/
//		Tablet tabObj = new Tablet();
//		tabObj.setName("Samsung");
//		tabObj.setPrice(30000);
//		tabObj.setMemory("32 GB");
//		tabObj.setScreenSize("10.2 / 7");
//		tabObj.advantages();
//		System.out.println("Details of the tablet are:");
//		tabObj.deviceDetails();
		
	}

}
