package practice;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOneinArrayOtherWay {

	public static void main(String[] args) {
		int[] digits = {9,9};
		for(int i=digits.length-1; i>=0;i--) {
			if(digits[i]<9)
			{
				digits[i]=digits[i]+1;
				System.out.println("New Array after adding: "+Arrays.toString(digits));
				break;
				
			}
			else
				digits[i]=0;
			
		}
		if(digits[0]==0)
		{
			digits = new int[digits.length+1];
			digits[0]=1;
			System.out.println("New Array after adding: "+Arrays.toString(digits));
			
		}

	}

}
