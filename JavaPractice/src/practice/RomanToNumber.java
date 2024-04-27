package practice;

import java.util.HashMap;

public class RomanToNumber {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		HashMap<Character,Integer> RomanLetters = new HashMap<>();
		RomanLetters.put('I', 1);
		RomanLetters.put('V', 5);
		RomanLetters.put('X', 10);
		RomanLetters.put('L', 50);
		RomanLetters.put('C', 100);
		RomanLetters.put('D', 500);
		RomanLetters.put('M', 1000);
		int num =0;
		for (int i = 0; i < s.length(); i++) {
            int currentValue = RomanLetters.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int nextValue = RomanLetters.get(s.charAt(i + 1));
                if (currentValue >= nextValue) {
                    num += currentValue;
                } else {
                    num -= currentValue;
                }
            } else {
                num += currentValue;
            }
        }
        
		System.out.println(num);
		

	}

}
