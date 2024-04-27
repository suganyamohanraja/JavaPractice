package practice;

import java.util.HashMap;

public class AnagramCheck {

	public static void main(String[] args) {
		String s= "anagram";
		String t = "naamrag";
		HashMap<String,Integer> sMap = new HashMap<>();
        HashMap<String,Integer> tMap = new HashMap<>();
        Boolean anagrame = false;
        if(s.length()==t.length())
        {
            for(int i=0;i<s.length();i++)
            {
                if(sMap.containsKey(String.valueOf(s.charAt(i))))
                {
                    sMap.put(String.valueOf(s.charAt(i)),(sMap.get(String.valueOf(s.charAt(i))))+1);
                    
                }
                else
                {
                    sMap.put(String.valueOf(s.charAt(i)),1);
                    
                }
                if(tMap.containsKey(String.valueOf(t.charAt(i))))
                {
                    tMap.put(String.valueOf(t.charAt(i)),(tMap.get(String.valueOf(t.charAt(i))))+1);
                }
                else
                    tMap.put(String.valueOf(t.charAt(i)),1);
                    
            }
            System.out.println(sMap.entrySet());
            System.out.println(tMap.entrySet());
            if(sMap.equals(tMap))
            	anagrame=true;
        }
        System.out.println(anagrame);
        

	}

}
