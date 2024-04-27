package practice;

public class SubstringFirstOccurence {

	public static void main(String[] args) {
		String haystack = "leetcode";
		String needle = "leeto";
		int needleIndex = -1;
        if(haystack.contains(needle))
        {
            needleIndex = haystack.indexOf(needle);

        }
        System.out.println(needleIndex);

	}

}
