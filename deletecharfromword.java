package wipro_training;

public class deletecharfromword {
	public static void main(String args[]) {
		String s1="subhash";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!='a') System.out.print(s1.charAt(i));
			else System.out.print('8');
		}
	}

}
