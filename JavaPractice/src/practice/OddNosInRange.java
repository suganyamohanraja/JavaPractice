package practice;

public class OddNosInRange {

	public static void main(String[] args) {
		int high = 4;
		int low = 0;
		int criteria=high-low+1;
		int oddCount=0;
		if(criteria%2==0)
			oddCount=criteria/2;
		else
		{
			if(high%2==0)
			{
				criteria=criteria-1;
				oddCount = criteria/2;
			}
			else
			{
				criteria=criteria+1;
				oddCount = criteria/2;
			}
				
			
				
			
		}
		System.out.println(oddCount);
	}

}
