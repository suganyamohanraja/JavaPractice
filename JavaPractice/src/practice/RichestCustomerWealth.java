package practice;

import java.util.Arrays;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
		int[] values = new int[accounts.length];
		int temp = 0;
		for(int i=0;i<accounts.length;i++)
		{
			int value = 0;
			for(int j=0;j<accounts[0].length;j++)
			{
				
				value=accounts[i][j]+value;
			}
			values[i]=value;
			
		}
		for(int k=0;k<values.length;k++)
		{
			if(values[k]>temp||values[k]==temp)
				temp = values[k];
		}
		System.out.println(temp);
		Arrays.sort(values);
		System.out.println(values[values.length-1]);

	}

}
