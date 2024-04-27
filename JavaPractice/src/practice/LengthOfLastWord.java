package practice;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "luffy checcccc";
		String[] arr = s.split(" ");
		int len = arr[arr.length - 1].length();
		System.out.println(len);
		System.out.println(arr[arr.length - 1]);

	}

}
