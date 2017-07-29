import irishFood.*;


public class HelloWorld {
	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println("Salutations, I am Lilly.");
		
		// BEEEEER
		int beerBottles = 99;
		
		System.out.println(beerBottles + " bottles of beer on the wall");
		
		/* BEEEEERRRRR LOOOOP
		 */
		while (beerBottles > 0) {
			beerBottles -= 1;
			System.out.println(beerBottles + " bottles of beer on the wall");
		}
		
		String potato = "Potato";
		System.out.println(potato);
		
		// POTATO
		for (int potatoes = 10; potatoes >= 0; potatoes -= 1) {
			System.out.println("The Irish have " + potatoes + " potatoes left.");
			if (potatoes == 0) {
				System.out.println("Oh noes le Irish are starving.");
			} else if (potatoes % 3 == 0) {
				System.out.println("three potato for all survivors");
			}
		}
		
		
		//-------------------------------
		
		System.out.println("Hello World");
		
		boolean irishStarving = false;
		double pootatoMoneys = Math.round(Math.random()*19 + 1) ;
		
		while (pootatoMoneys >= 0){
			if (irishStarving) {
				System.out.println("More potaato plez");
			}
			pootatoMoneys -= 3.50;
			System.out.println("They have " + pootatoMoneys+" dollars left.");
			
			if (pootatoMoneys < 3.50) {
				irishStarving = true; 
			}
		}
		
		System.out.println(screamPotato(99));
		danceJig();
		Potato.yellAboutPerderders();
		
		Potato steve = new Potato("brown", 98, false);
		Potato mary = new Potato("red", 13, true);
		steve.describe("Steve");
		mary.describe("Mary");
		// steve.eat(mary);
		
		Potato[] perderderpatch = new Potato[6];
		perderderpatch[2] = new Potato("green", 25, false);
		perderderpatch[2].describe("jorj");
		
		int[] numbers = new int[] {5, 3, 2, 4, 1};
		Integer number = new Integer(13);
		
	}
	
	public static String screamPotato(int repeat) {
		for (int i=repeat; i>0; i=(i-1)){
			System.out.println("POTATO");
		}
		return ("I screamed " + repeat + " times.");
	}
	
	public static void danceJig() {
		System.out.println("Get your shoes moving.");
		System.out.println("\\o\\ \\o/ /o/");
		System.out.println(" |   |   |    woo");
		System.out.println("/ \\ / \\ / \\");
	}

	// main(...)
}
