package practice;

import java.util.Arrays;

public class ArithemticProgressionArray {

	public static void main(String[] args) {
		int[] arr = {1,2,4};
		Arrays.sort(arr);
		int diff = arr[0]-arr[1];
		Boolean isArithmetic = false;
		System.out.println(diff);
		for (int i=0; i+1<arr.length;i++)
		{
			if((arr[i]-arr[i+1])==diff)
			{
				isArithmetic = true;
				continue;
			}
			else
			{
				isArithmetic = false;
				break;
			}
		}
		System.out.println(isArithmetic);
	}

}
