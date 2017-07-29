import irishFood.Potato;
import irishFood.Yam;

public class ArrayStuffs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers;
		
		numbers = new int[5];
		numbers[0] = 2;
		
		numbers = new int[] {5, 3, 2, 4, 1};
		
		Yam hillaryClinton = new Yam("white", 51, false, "Hillary Clinton");
		Yam theDonald = new Yam("orange", 53, false, "The Donald");
		theDonald.describe();
		hillaryClinton.toss("far");
		theDonald.toss("near");
		
		// Casting
		Potato theDonaldAsPotato = theDonald;
		Yam theDonaldAsYam;
		if (theDonaldAsPotato instanceof Yam) {
			theDonaldAsYam = (Yam) theDonaldAsPotato;
		}
		
		Potato mary = new Potato("indigo", 54, false, "Mary");
		Potato ruby = new Potato("ruby", 2, true);
		Potato frank = new Potato("orange", 98, true);
		Potato opal = new Potato("violet", 15, false, "opal");
		Potato ivan = new Potato("gray", 46, true);
		Potato jill = new Potato("rose", 75, false);
		Potato[] perderderpatch = new Potato[] {mary, ruby, frank, opal, ivan, jill, theDonald, new Potato("green", 34, true)};
		System.out.println(mary);
		int yum = 0;
		for (int i=0; i < perderderpatch.length; i+=1) {
			if (perderderpatch[i].quality) {
				yum += 1;
			}
		}
		System.out.println("There are "+yum+" quality potatoes.");
		
		System.out.println(sequentialSearch(perderderpatch, opal));
		
		numbers = new int[] {-322, -26, -12, -4, 2, 18, 37, 68, 94, 1573, 682418};
		
		System.out.println(binarySearch(numbers, 94));
	}
	
	private static String sequentialSearch(Potato[] perderderpatch, Potato key) {
		for (int i=0; i < perderderpatch.length; i +=1) {
			Potato item = perderderpatch[i];
			if (item.equals(key)) {
				return item.name;
			}
		}
		return "No potato found";
	}
	
	private static int binarySearch(int[] numbers, int key) {
		return binarySearch(numbers, key, 0, numbers.length);
	}
	
	private static int binarySearch(int[] numbers, int key, int start, int finish) {
		if (start > finish) {
			return 0;
		}
		
		int middle = (start + finish)/2;
		int thing = numbers[middle];
		if (thing == key) {
			return thing;
		} else if (thing < key) {
			return binarySearch(numbers, key, middle, finish);
		} else {
			return binarySearch(numbers, key, start, middle);
		}
	}

}
