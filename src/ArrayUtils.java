//	Dennis Sauve
//	Brian Kamp
//	CSCD 210
//	Array Utils Assignment

public class ArrayUtils {

	public static void main(String[] args) {
		// Print Array Methods Tests
		printArray(new int[] {1, 2, 3, 4, 5});
		System.out.println();
		printArray(new double[] {1.0, 2.4, 3.141, 4.6, 5.0});
		System.out.println();
		printArray(new java.lang.String[] {"Dennis", "Brian", "Jason", "CSCD", "210"});
		System.out.println();
	}
	
	/*
	 * 	Print Array Methods
	 */
	
	public static void printArray(int[] array) {
		for(int ix = 0; ix < array.length; ix++) {
			System.out.print(array[ix]);
			if(ix < array.length - 1) System.out.print(", ");
		}
	}
	
	public static void printArray(double[] array) {
		for(int ix = 0; ix < array.length; ix++) {
			System.out.print(array[ix]);
			if(ix < array.length - 1) System.out.print(", ");
		}
	}
	
	public static void printArray(java.lang.String[] array) {
		for(int ix = 0; ix < array.length; ix++) {
			System.out.print(array[ix]);
			if(ix < array.length - 1) System.out.print(", ");
		}
	}
	
	

}
