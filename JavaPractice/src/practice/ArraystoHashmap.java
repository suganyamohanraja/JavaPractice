package practice;

import java.util.HashMap;
import java.util.Map;

public class ArraystoHashmap {

	public static HashMap map(Integer[] keys, 
			String[] values) 
	{ 
		// two variables to store the length of the two 
		// given arrays 
		int keysSize = keys.length; 
		int valuesSize = values.length; 

		// if the size of both arrays is not equal, throw an 
		// IllegalArgumentsException 
//		if (keysSize != valuesSize) { 
//			throw new IllegalArgumentException( 
//					"The number of keys doesn't match the number of values."); 
//		} 

		// if the length of the arrays is 0, then return an 
		// empty HashMap 
		if (keysSize == 0) { 
			return new HashMap(); 
		} 

		// create a new HashMap of the type of keys arrays 
		// and values array 
		HashMap<Integer, String> map 
		= new HashMap<Integer, String>(); 

		// for every key, value 
		for (int i = 0; i < valuesSize; i++) { 

			// add them into the HashMap by calling the 
			// put() method on the key-value pair 
			try
			{
				map.put(keys[i], values[i]); 
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				map.put(null, values[i]);
			}
		} 

		// return the HashMap 
		return map; 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		// create an array for keys 
		Integer[] keys = { 1, 2, 3, 4, 5 }; 

		// create an array for value 
		String[] values 
		= { "Welcome", "To", "Geeks", "For", "Geeks","Test", "Test2" }; 

		// call the map() method over the keys[] array and 
		// values[] array 
		Map m = map(keys, values); 

		// print the returned map 
		System.out.println(m); 
	} 

}
