package wipro_training;

public class string_decode {

	public static void main(String[] args) {
		String str="t7e4a3c6t1",str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				int l=0;
				while(l<str.charAt(i)-'0') {
					str1=str1.concat(str.charAt(i-1)+"");
					l++;
				}
			}
			
		}
		System.out.print(str1);

	}

}
