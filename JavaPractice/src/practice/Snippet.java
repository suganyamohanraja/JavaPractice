package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snippet {
	public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	        int N = Integer.parseInt(bufferedReader.readLine().trim());
	        if((N%2==0) && ((N>20)||(N>=2) && (N<=5)))
	        { System.out.println("Not Weird");}
	        else if((N%2==1) || ((N%2==0) && ((N<=20) && (N>=6))))
	        { System.out.println("Weird");}
	        System.out.println("Even: "+(N%2==0));
	        System.out.println("Odd: "+(N%2==1));
	        System.out.println("Greater than 20: "+(N>20));
	        System.out.println("Lesser than 5: "+(N<=5));
	        System.out.println("Greater than 2: "+(N>=2));
	        System.out.println("Greater than 6: "+(N>=6));
	        System.out.println("Lesser than 20: "+(N<=20));
	        System.out.println("First condition: "+((N%2==0) &&(N>20)||(N>=2) && (N<=5)));
	        System.out.println("Second condition: "+ ((N%2==1) || ((N%2==0) && ((N<=20) && (N>=6)))));
	        
	
	        bufferedReader.close();
		 		  
	    }
}

