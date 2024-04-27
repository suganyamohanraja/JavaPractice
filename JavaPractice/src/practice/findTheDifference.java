package practice;

import java.util.HashMap;

public class findTheDifference {

	public static void main(String[] args) {
//		String s = "";
//		String t = "a";
		String s = "ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor";
		String t = "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";
		char ExtraLetter = 0;
		
		HashMap<String,Integer> sMap = new HashMap<>();
		HashMap<String,Integer> tMap = new HashMap<>();
		
		for (int i=0;i<s.length();i++)
		{
			
				if(sMap.containsKey(String.valueOf(s.charAt(i))))
				{
//				System.out.println(sMap.get(String.valueOf(s.charAt(i))).intValue());
					sMap.put(String.valueOf(s.charAt(i)), (sMap.get(String.valueOf(s.charAt(i)))+1));
//					System.out.println(sMap.entrySet());
					
				}
					
				else
				{
					sMap.put(String.valueOf(s.charAt(i)), 1);
//					System.out.println(sMap.entrySet());
				}
			
				
		}
		for (int j=0;j<t.length();j++)
		{
			if(tMap.containsKey(String.valueOf(t.charAt(j))))
			{
				System.out.println("tMap "+j+": "+tMap.get(String.valueOf(t.charAt(j))));
				tMap.put(String.valueOf(t.charAt(j)), (tMap.get(String.valueOf(t.charAt(j))))+1);
				continue;
			}
			else
			{
				tMap.put(String.valueOf(t.charAt(j)), 1);
			}
		}
		System.out.println("sMap is:  "+sMap.entrySet());
		System.out.println("tMap is:  "+tMap.entrySet());
		for (int k=0;k<t.length();k++)
		{
			if(sMap.containsKey(String.valueOf(t.charAt(k))))
			{
				if((tMap.get(String.valueOf(t.charAt(k))))== (sMap.get(String.valueOf(t.charAt(k)))))
				{
					continue;
				}
				else
				{
					ExtraLetter = t.charAt(k);
					break;
				}
			}
			else
			{
				ExtraLetter = t.charAt(k);
				break;
			}
		}
		System.out.println("ExtraLetter:  "+ExtraLetter);

	}

}
