package practice;

public class IsMonotonicArray {

	public static void main(String[] args) {
		int[] nums = {1,2,2};
		int isIncreasing = 0;
		int isDecreasing = 0;
		boolean isMonotonic = true;
		for(int i=0; i+1<nums.length;i++)
		{
			if(nums[i]>nums[i+1])
				isIncreasing = isIncreasing+1;
			else if (nums[i]==nums[i+1])
				isMonotonic=true;
			else if (nums[i]<nums[i+1])
				isDecreasing = isDecreasing+1;
			if(isIncreasing>0 && isDecreasing>0)
			{
				isMonotonic=false;
				break;
			}
		}
		System.out.println(isMonotonic);
		

	}

}
