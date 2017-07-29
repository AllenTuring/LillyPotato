package irishFood;

public class Yam extends Potato {

	public Yam(String color, double size, boolean quality) {
		super(color, size, quality, "Unidentified Yam");
		// TODO Auto-generated constructor stub
	}
	
	public Yam(String color, double size, boolean quality, String name) {
		super(color, size, quality, name);
		// TODO Auto-generated constructor stub
	}
	
	public void toss(String distance) {
		if (distance.equals("far")) {
			System.out.println("Yam "+ this.name +" has been thrown far and is now squish.");
		} else if (distance.equals("near")) {
			System.out.println("Yam "+ this.name +" has been thrown near.");
			boolean dirty = Math.random() > 0.5;
			if (dirty) {
				System.out.println("Beware, le yam is dirty. No eat.");
			} 
			if (!dirty) {
				System.out.println("5 sec rule. Eat le yam now.");
			}
		}
		
		
	}

}
