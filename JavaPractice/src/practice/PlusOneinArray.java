package practice;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOneinArray {

	public static void main(String[] args) {
		int[] num = {9,8,7,6,5,4,3,2,1,0};
		BigInteger largenum = BigInteger.valueOf (0);
		for(int i=0; i<num.length;i++) {
			BigInteger bigPlaceValue = BigInteger.valueOf((long) Math.pow(10,(num.length-1-i)));
			largenum = largenum.add(BigInteger.valueOf(num[i]).multiply(bigPlaceValue));
			
		}
		System.out.println(largenum);
		largenum = largenum.add(BigInteger.valueOf(1));
		System.out.println("After Adding: "+largenum);
		System.out.println(largenum.toString().length());
		int newlength = largenum.toString().length();
		String largenum1=largenum.toString();
		int[] num1 = new int[newlength];
		for(int j=0;j<newlength;j++)
		{
			num1[j]= Integer.parseInt(String.valueOf(largenum1.charAt(j)));
		}
		System.out.println("New Array after adding: "+Arrays.toString(num1));

	}

}
