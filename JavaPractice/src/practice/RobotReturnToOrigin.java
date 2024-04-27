package practice;

public class RobotReturnToOrigin {

	public static void main(String[] args) {
		String moves = "LL";
		int right =0;
		int down = 0;
		for(char ch:moves.toCharArray())
		{
			switch(ch)
			{
			case 'U':
				down++;
				break;
			case 'D':
				down--;
				break;
			case 'R':
				right++;
				break;
			case 'L':
				right--;
				break;
				
			}
		}
		if(down==0 && right==0)
			System.out.println(true);
		else 
			System.out.println(false);

	}

}
