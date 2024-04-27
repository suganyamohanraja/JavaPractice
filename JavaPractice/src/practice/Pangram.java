package practice;

public class Pangram {
	public static boolean pangramOrNot(String str)
	{
		Boolean pangram = false;
		int count=0;
		if(str.length()==26)
		{
			for(int i=0;i<25;i++)
			{
				if(!OnlyOneOccurence(str.charAt(i),str))
				{
					count=count+1;
					break;
				}
					
			}
		}
		System.out.println("pangramOrNot: "+count);
		if(count==0)
			pangram=true;
		return pangram;
	}
	public static boolean OnlyOneOccurence(char ch,String str)
	{
		
		int count=0;
		for (int i=0;i<str.length();i++)
		{
			if(String.valueOf(ch).equalsIgnoreCase(String.valueOf(str.charAt(i))))
			{
				count=count+1;
			}
		}
		System.out.println("OnlyOneOccurence: "+count);
		if (count>1 || count==0)
			return false;
		else if(count==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Boolean isPanagram = pangramOrNot("abcdefgpqrstuvwxyzhijklmna");
		System.out.println("Given String is Panagram: "+isPanagram);

	}

}
