package irishFood;
public class Potato {
	
	public static void yellAboutPerderders() {
		System.out.println("Get off me perderder patch");
	}
	
	// Variables about potato
	public static String color;
	public double size;
	public boolean quality;
	public String name;
	
	// Constructor
	public Potato(String color, double size, boolean quality) {
		this(color, size, quality, "Unknown Potato");
	}
	
	public Potato(String color, double size, boolean quality, String name) {
		this.color = color;
		this.size = size;
		this.quality = quality;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " the potato, which has "+ this.quality +" quality.";
	}
	
	public void describe() {
		describe(this.name);
	}

	public void describe(String name) {
		String description = name + " is "+ this.color +" and has size "+ this.size;
		if (this.quality) {
			System.out.println(name + "'s potato much quality.");
		} else {
			System.out.println("do not eat " + name + " for he is crap qualities");
		}
		System.out.println(description);
	}
	
	public void eat(Potato p) {
		throw new IllegalArgumentException("Potato cannot into cannibalism");
	}
	
}
