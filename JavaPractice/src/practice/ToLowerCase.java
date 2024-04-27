package practice;

public class ToLowerCase {

	public static void main(String[] args) {
		String s = "LOVELY";
		String result = "";
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            
            //check valid alphabet and it is in Uppercase
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ch = (char)(s.charAt(i) + 32);
                System.out.println(Character.getNumericValue(ch));
                
            }
            //else keep the same alphabet or any character
            else {
                ch = (char)(s.charAt(i));
            }
            
            result += ch; // concatenation, append c to result
        }
        System.out.println(result);

	}

}
