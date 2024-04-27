package practice;

public class SubstringRepeated {

	public static void main(String[] args) {
		String s = "abcdabcdabcd";
//		abaa
		char s1 = 0;
		int seqStartIndex = 0;
		int seqNextIndex = 0;
		String seq1 = null;
		String nextSeq = null;
		for (int i=0;i<s.length();i++)
		{
			s1 = s.charAt(i);
			seqStartIndex = i;
			if(seqNextIndex==s.length()-1)
				break;
			seqNextIndex = s.indexOf(s1, i+1);
			if(seqNextIndex<0)
				continue;
//			if(seqNextIndex-seqStartIndex==1)
//			{
//				seq1 = s.substring(seqStartIndex, seqNextIndex+1);	
//				nextSeq = s.substring(seqNextIndex+1);
//			}
//				
//			else
//			{
				seq1 = s.substring(seqStartIndex, seqNextIndex);
				nextSeq = s.substring(seqNextIndex);
//			}
				
			if(nextSeq.contains(seq1))
			{
				System.out.println(nextSeq);
				System.out.println(seq1);
				System.out.println("Sequence repeated");
				for (int j=seqNextIndex;j<s.length();)
				{
					if(seqNextIndex>=s.length())
						break;
					else
					{
						(s.substring(seqNextIndex,seqNextIndex+seqNextIndex-1)).contains(seq1);
						System.out.println("Sequence repeated again");
						j=seqNextIndex+seqNextIndex;
					}
				}
				break;
			}
			else
			{
				System.out.println(nextSeq);
				System.out.println(seq1);
				System.out.println("Sequence not repeated");
			}
		}
		
		

	}

}
