package practice;

public class MergeStringsAlternatively {

	public static void main(String[] args) {
		String txt = "ABCDE";
	    String txt1 = "123456";
	    String mergedString = null; 
	    int l1 = txt.length();
        int l2 = txt1.length();
        int l3 = 0;
	    int k = 0;
	    char[] ch2= new char[txt.length()+txt1.length()];
	    char[] ch = txt.toCharArray();
	    char[] ch1 = txt1.toCharArray();
	    if(1<=l1 && l2 <=100)
        {
            if(l1>l2)
            {
                l3 =l2;
            }
            else if (l2>l1)
            {
                l3 = l1;
            }
            else
            {
                l3 = l1;
            }
	    int j =0;
	    
	    for(int i=0;i<l3;i++)
	    {
	    	ch2[j] = ch[i];
	    	j++;
	        ch2[j] = ch1[i];
	        j++;
	        k=i;
	    }
	    if(j<ch2.length)
	    {
	    	for(;j<ch2.length;j++)
	    	{
	    		k++;
	    		if(ch.length>ch1.length)
	    		    ch2[j]=ch[k];
                if(ch.length<ch1.length)
	    		    ch2[j]=ch1[k];
	    		
	    	}
	    }
	    mergedString = String.valueOf(ch2);
        }
	    System.out.println(mergedString);


	}

}
