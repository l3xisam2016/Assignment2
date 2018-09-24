
public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static int LinearSearch(int[] numbers2, int numbersSize, int key) {   
		
		
		int[] numbers = {2, 4, 7, 10, 11, 32, 45, 87};
		int NUMBERS_SIZE = 8;
		int  i = 0;
		key = 0;
		int keyIndex = 0;
				      
		System.out.print("NUMBERS: ");
			for (i = 0; i < NUMBERS_SIZE; ++i) {
				System.out.println(numbers[i] + " ");
				   }
		System.out.println();
				      
		System.out.print("Enter a value: ");
			key = getIntFromUaer();
				   
				      
		 keyIndex = LinearSearch(numbers, NUMBERS_SIZE, key);
				      
		if (keyIndex == -1) {
			System.out.println(key + " was not found.");
				   } 
		else {
			System.out.println("Found " + key + " at index " + keyIndex + "."); }
		return key;
				}
		
				 private static int getIntFromUaer() {
				
				return 0;
			}
		}
		 

