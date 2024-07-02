package wipro_training;

public class Validation_of_identifier {
	public static void main(String []args) {
		String s="regno";int flag=0;
		if(s.charAt(0)=='$' || s.charAt(0)=='_' || s.charAt(0)>='a'&&s.charAt(0)<='z' || s.charAt(0)>='A'&&s.charAt(0)<='Z') {
			for(int i=1;i<s.length();i++) {
				if(s.charAt(i)>='0'&&s.charAt(i)<='9' || s.charAt(i)=='_' || s.charAt(i)>='a'&&s.charAt(i)<='z' || s.charAt(i)>='A'&&s.charAt(i)<='Z') {
					 flag=1;
				}
				if(flag==0)
					System.out.print("Not an Identifier");
					break;
				flag=0;
			}
			
		}
		else 
			System.out.print("Not an Identifier");
	}
}
