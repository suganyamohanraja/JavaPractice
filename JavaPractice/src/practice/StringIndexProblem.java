package practice;

import java.util.HashMap;

public class StringIndexProblem {

	public static void main(String[] args) {
		String s = "mDVD";
		String t = s.toLowerCase();
//        HashMap<String,Integer> tMap = new HashMap<>();
        int counter = 0;
//        for(int i=0;i<s.length();i++)
//            {
//                if(tMap.containsKey(String.valueOf(t.charAt(i))))
//                {
//                    tMap.put(String.valueOf(t.charAt(i)),(tMap.get(String.valueOf(t.charAt(i))))+1);
//                }
//                else
//                    tMap.put(String.valueOf(t.charAt(i)),1);
//                    
//            }
//        if(tMap.size()>1)
//        	counter = tMap.size()-1;
//        	
//       System.out.println(tMap.entrySet()); 
//       System.out.println(tMap.size()); 
		
        for(int i=0;i<t.length();i++)
        {
        	if(i==t.length()-1)
        	{
        		continue;
        		
        	}
        	if(t.charAt(i)!= t.charAt(i+1))
        	{
        		counter = counter+1;
        	}
        }
       System.out.println(counter); 
       

	}

}
