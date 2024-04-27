package practice;

public class SubstringRepeated3rdTry {

	public static void main(String[] args) {
		String s = "bbbabbba";
//		abaa
		boolean repeated = false;
		char s1 = 0;
		int seqStartIndex = 0;
		int seqNextIndex = 0;
		String seq1 = null;
		int Strlength = s.length();
		int subseqlength = 0;
		int remainder = 0;
		int repeats = 0;
		for (int i=0;i<s.length();i++)
		{
			s1 = s.charAt(i);
			seqStartIndex = i;
			if(seqNextIndex==s.length()-1)
				break;
			seqNextIndex = s.indexOf(s1, i+1);
			if(seqNextIndex<0)
				continue;
			seq1 = s.substring(seqStartIndex, seqNextIndex);
			if(seqNextIndex==1 && seqNextIndex<Strlength)
			{
				repeated = seq1.equals(s.charAt(seqNextIndex+1));
				if(repeated==false)
				{
					seqNextIndex = s.indexOf(s1, seqNextIndex+1);
					seq1 = s.substring(seqStartIndex, seqNextIndex);
				}
			}
			
			subseqlength = seq1.length();
			repeats = Strlength/subseqlength;
			remainder = Strlength%2;
			while(seqNextIndex<Strlength)
				{
					if((seqNextIndex+subseqlength)>Strlength)
						break;
					if(seq1.equals(s.substring(seqNextIndex,(seqNextIndex+subseqlength))))
					{
						repeated = true;
						seqNextIndex=seqNextIndex+subseqlength;
					}
					else
					{
						repeated = false;
						seqNextIndex=seqNextIndex+subseqlength;
						break;
						
					}
					if(repeated==true && remainder==1&& subseqlength>1)
						repeated = false;
						
						
				}
			break;
			}
			System.out.println(repeated);
			System.out.println(seq1);
//			System.out.println(s.substring(seqNextIndex,(seqNextIndex*2)));
		
		

	}

}
