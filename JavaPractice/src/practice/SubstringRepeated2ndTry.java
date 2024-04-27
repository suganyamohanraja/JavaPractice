package practice;

public class SubstringRepeated2ndTry {

	public static void main(String[] args) {
		String s = "baabaa";
//		abaa
		boolean repeated = false;
		int len = s.length();
		for (int i = len/2;i>0;i--)
		{
			if(len%i==0)
			{
				int num_str=len/i;
				String str=s.substring(0,i);
				StringBuilder sb = new StringBuilder();
				for(int i1 = 0; i1<num_str;i1++)
				{
					sb.append(str);
					
				}
				if(sb.toString().equals(s))
					repeated = true;
			}
		}
		System.out.println(repeated);

	}

}
