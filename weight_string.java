package wipro_training;

public class weight_string {
	public static void main(String args[]) {
		String input1="abc a";
		String vow="aeiou";
		int input2=1;
		int cons=0,vsum=0;
		for(int i=0;i<input1.length();i++) {
			if(vow.contains(input1.charAt(i)+"")==true)
					vsum=vsum+(input1.charAt(i)-96);
					
			else if(input1.charAt(i)>='a' && input1.charAt(i)<='z')
				cons=cons+(input1.charAt(i)-96);
		}
		if(input2==0)
			System.out.println(cons);
		else
			System.out.println(cons+vsum);
	}

}
