package practice;

public class ArrayProductSign {

	public static void main(String[] args) {
		int[] digits = {-1,-2,0,-3,2,1};
		int positive = 1;
		int signdetails = 0;
		for(int i=0;i<digits.length;i++)
		{
			if(digits[i]==0)
			{
				signdetails =0;
				positive = 0;
//				System.out.println(0);
				break;
			}
//			product = product*digits[i];
			if(digits[i]<0)
			{
				signdetails = signdetails+1;
			}
			else
				positive = positive+1;
				
				
		}
		if(signdetails%2 > 0 )
			System.out.println(-1);
		else if(signdetails == 0 && positive ==0)
			System.out.println(0);
		else
			System.out.println(1);

	}

}
