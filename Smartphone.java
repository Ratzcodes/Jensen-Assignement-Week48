package Week48;

public class Smartphone extends Computer{

	//define properties
	private String cameraPixels;
	
	public Smartphone(){
		System.out.println("Constructor of the smartphone class");
	}
	
	public void usability() {
		System.out.println("Has the highest usability features.");
	}
	
	public void setCameraPixels(String pixels) {
		this.cameraPixels= pixels;
	}
	
	public String getCameraPixels() {
		return this.cameraPixels;
	}
	
	
	@Override
	public void inputDevices() {
		System.out.println("Almost all of the input devices are connected through wifi for smartphones");
		
	}

}
