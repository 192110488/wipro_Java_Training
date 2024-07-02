package wipro_training;

public class increase_decreaseorder_of_string {
	
	public static void check(String s1,String s2) {
		int count=0,i;
		for(i=0;i<s1.length() && i<s2.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) count++;
		}
		System.out.print(count);
	}
	
	public static void main(String []args) {
		String a="ACZa";
		String b="CAZa";
		int j=1,flag=0;
		if(a.charAt(0)<a.charAt(1)) flag=0;
		else if(a.charAt(0)>a.charAt(1)) flag=1;
		switch(flag) {
			case 0:{
				j=1;
				while(j<a.length()) {
					if(a.charAt(j)<a.charAt(j-1)) {
						System.out.print("invalid");
						break;
					}
					j++;
				}
				if(j==a.length()) {
					System.out.print("increase");
					check(a,b);
				}
				break;
			}
			
			case 1:{
				j=1;
				while(j<a.length()) {
					if(a.charAt(j)>a.charAt(j-1)) {
						System.out.print("invalid");
						break;
					}
					j++;
				}
				if(j==a.length()) {
					System.out.print("decrease");
					check(a,b);
				}
				break;
			}
		}
		
	}
}
