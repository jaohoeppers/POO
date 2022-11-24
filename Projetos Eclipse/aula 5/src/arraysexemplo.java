import java.util.Arrays;

public class arraysexemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] doubleArray = {8.4,9.3,0.2,7.9,3.4};
		
		Arrays.sort(doubleArray);
		
		System.out.printf("%ndoubleArray: ");
		for(double value : doubleArray)
			System.out.printf("%.1f | ",value);
		
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray,"filledintArray");
		
		
		int[]intArray= {1,2,3,4,5,6};
		int[]intArraycopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArraycopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArraycopy, "intArraycopy");
		
		boolean b = Arrays.equals(intArray, intArraycopy);
		System.out.printf("intArray %s intArraycopy%n", (b ? "==" : "!="));
		
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("intArray %s filledIntArray%n", (b ? "==" : "!="));
		
		int location = Arrays.binarySearch(intArray, 5);
		
		if (location >= 0)
			System.out.printf("found 5 at element %d in intArray%n", location);
		else
			System.out.printf("5 is not found in intArray");
		
		location = Arrays.binarySearch(intArray,8763);
		
		if(location >=0)
			System.out.printf("found 8763 at element %d in intArray%n", location);
		else
			System.out.printf("8763 is not found in intArray");

	}

	private static void displayArray(int[] Array, String description) {
		System.out.printf("%n%s: " , description);
		for (int value : Array)
			System.out.printf("%d ", value);
		
	}

}
