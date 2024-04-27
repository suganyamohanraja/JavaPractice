package practice;

import java.util.HashMap;

public class PangramHashMap {
	public  static boolean pangramOrNot(String s)
	{
		
		HashMap<String,Integer> sMap = new HashMap<>();
        Boolean pangram = false;
        if(s.length()==26)
        {
            for(int i=0;i<s.length();i++)
            {
                if(sMap.containsKey(String.valueOf(s.charAt(i)).toLowerCase()))
                {
                    sMap.put(String.valueOf(s.charAt(i)),(sMap.get(String.valueOf(s.charAt(i))))+1);
                    
                }
                else
                {
                    sMap.put(String.valueOf(s.charAt(i)),1);
                    
                }
            }
        }
        if(sMap.containsValue(2))
        	pangram=false;
        else
        	pangram=true;
	return pangram;

	}

	public static void main(String[] args) {
		Boolean isPanagram = pangramOrNot("abcdefgpqrstuvwxyzhijklmna");
		System.out.println("Given String is Panagram: "+isPanagram);
	}


}
