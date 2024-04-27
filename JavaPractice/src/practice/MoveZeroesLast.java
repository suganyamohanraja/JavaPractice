package practice;

import java.util.Arrays;

public class MoveZeroesLast {

	public static void main(String[] args) {
		int[] nums = {0,0,1};
		int nozero = 0;
		System.out.println(nums.length);
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				nums[nozero]=nums[i];
				nozero++;
			}
		}
		while (nozero < nums.length) 
			nums[nozero++] = 0;
				
			
//			while(nums[i]==0)
//			{
//				for(int j=i;j<nums.length;j++)
//				{
//					if(j+1==nums.length)
//						nums[j]=0;
//					else
//					{
//						
//						nums[j]=nums[j+1];
//					}
//						
//				}
//				System.out.println(nums);
//			}
//		}
		System.out.println(Arrays.toString(nums));
	}

}
