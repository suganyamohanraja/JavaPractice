package practice;

import java.util.HashMap;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		int onlyOnce=0;
        HashMap<String, Integer> numsMap = new HashMap<>();
        for (int i=0; i<nums.length;i++)
        {
            if(numsMap.containsKey(String.valueOf(nums[i])))
            {
                numsMap.put(String.valueOf(nums[i]),(numsMap.get(String.valueOf(nums[i])))+1);
                continue;
            }
            else
            {
                numsMap.put(String.valueOf(nums[i]),1);
            }
        }
        for(int j=0; j<nums.length;j++)
        {
            if(numsMap.get(String.valueOf(nums[j]))==2)
                continue;
            else
            {
                onlyOnce=nums[j];
                break;
            }
        }
        
       System.out.println(onlyOnce); 
	}

}
