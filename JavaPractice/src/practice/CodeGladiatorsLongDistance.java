package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeGladiatorsLongDistance {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
	        String TCnoCount;
	        String PaulDetails;
	        String NinaDetails;
	        try {
	            System.out.println("Enter the number of Test cases");
	            TCnoCount = reader.readLine(); // taking string input
	            System.out.println("Test Case count=" + TCnoCount);
	            System.out.println("Enter the Paul distance,speed,number of repairs ");
	            PaulDetails = reader.readLine();
	            System.out.println("Enter the Nina distance,speed,number of repairs ");
	            NinaDetails = reader.readLine();
	        }
	        catch (Exception e) {
	        }

	}

}
