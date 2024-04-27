package practice;

import java.util.ArrayList;
import java.util.List;

public class BaseBallGameSimulation {

	public static void main(String[] args) {
		String[] operations = {"1","C"};
		List<Integer> finalList = new ArrayList<>();
		int ListTotal =0;
		for(int i =0;i<operations.length;i++)
		{
			if((operations[i].equals("D"))||(operations[i].equals("+"))||(operations[i].equals("C")))
			{
				
				int n = finalList.size();
				if(operations[i].equals("C"))
				{
					finalList.remove(n-1);
				}
				if(operations[i].equals("D"))
				{
					int dOp = finalList.get(n-1)*2;
					finalList.add(dOp);
				}
				if(operations[i].equals("+"))
				{
					int dOp = finalList.get(n-1)+finalList.get(n-2);
					finalList.add(dOp);
				}
				
//				System.out.println(finalList.toString());
				
			}
			else
			{
				finalList.add(Integer.parseInt(operations[i]));
			}
		}
		System.out.println(finalList.toString());
		for (int j=0; j<finalList.size();j++)
		{
			ListTotal = ListTotal+finalList.get(j);
		}
		System.out.println(ListTotal);

	}

}
