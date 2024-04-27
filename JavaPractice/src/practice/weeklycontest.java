package practice;

public class weeklycontest {
	public static void main(String[] args) {
		int k=10;
		int[] nums = {2,11,10,1,3};
		int count = 0;
		 int temp=0;
		int n1=0;
		int n2=0;
//        for (int i=0;i<nums.length;i++)
//        {
//           if( nums[i]>k||nums[i]==k)
//        	   continue;
//           else
//        	   count = count+1;
//        }
//        System.out.println(count);
		
		 for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] > nums[j]) {
	                    temp = nums[i];
	                    nums[i] = nums[j];
	                    nums[j] = temp;
	                }
	            }
	        }
		 n1=nums[0];
		 n2=nums[1];
		 nums[0]=n1*2+nums[1];
		 count=count+1;
//		 create new array;
		 int[] newArray = new int[nums.length - 2];
		 for (int i = 0, j = 0; i < newArray.length; i++) {
			    if (i != 0 ||i != 1) {
			        newArray[j++] = nums[i];
			    }
			}
		 System.out.println(count);
	}
	

}
