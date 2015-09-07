
import java.util.Arrays;
import java.lang.System;

public final class ArrayManupulation {

	public static int FindStartIndexOfSecondArray(int[] array1, int[] array2)
	{
		if ((array1.length == 0) || (array2.length == 0)) return -1;
		
		// Sort the arrays
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		// Find the first element of second array in the First Array
		int index = Arrays.binarySearch(array1, array2[0]);
		if (index >= 0)
		{
			// check if we have the same number of elements when compared to the 
			// from the index point of the first array AND
			// total length of the second array
			int length = (array1.length - index);
			
			if (length < array2.length) return -1;
			if (length > array2.length) length = array2.length;
			
			// copy the array from first into tmpArray
			int tmpArray[] = new int[length];
			System.arraycopy(array1, index, tmpArray, 0, length);

		
			// check if the arrays tmpArray and second array are equal
			if (Arrays.equals(tmpArray, array2))
			{
				return index; 
			}
		}
		
		return -1;
	}
}

