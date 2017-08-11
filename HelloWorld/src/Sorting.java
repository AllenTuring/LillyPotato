
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers1 = new int[] {51, 32, 45, 79, 6, 65, 54, 5, 8, 87, 654, 4};
		int[] numbers = mergeSort(numbers1);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static int[] mergeSort(int[] bob) {
		return mergeSort(bob, 0, bob.length);
	}
	
	private static int[] mergeSort(int[] bob, int start, int finish) {
		// If it's zero or one length (or less), we're done
		if (finish - start <= 1) {
			return bob;
		}
		
		int mid = (start + finish) / 2;
		mergeSort(bob, start, mid);
		mergeSort(bob, mid, finish);
		
		int a = start;
		int b = mid;
		int[] buffer = new int[finish - start];
		for (int i = 0; i < buffer.length; i++) {
			if (a < mid && (b >= finish || bob[a] <= bob[b])) {
				buffer[i] = bob[a];
				a++;
			} else {
				buffer[i] = bob[b];
				b++;
			}
		}
		for (int i = start; i < finish; i++) {
			bob[i] = buffer[i - start];
		}
		return bob;
	}
	
	// Merge!
	private static int[] merge(int[] doggo, int[] catto) {
		int[] pets = new int[doggo.length + catto.length]; 
		int a = 0;
		int b = 0;
		for (int i = 0; i < pets.length; i++){
			if (a < doggo.length && (b >= catto.length || doggo[a] <= catto[b])) { 
				pets[i] = doggo [a]; 
				a += 1;
			} else { 
				pets[i] = catto [b]; 
				b += 1;
			} 
		}
		return pets;
	}

}
