package wipro_training;

public class increase_or_decrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ACZa";
		String b="CAaZ";
		int count=0,i=1,val=0;
		if(a.charAt(0)!=b.charAt(0)) val++;
		while(i<a.length()) {
			if(a.charAt(i-1)<a.charAt(i)) {
				count++;
			}
			if(a.charAt(i)!=b.charAt(i)) val++;
			i++;
		}
		if(count==0)
			System.out.print("decrease"+" "+val);
		else if(count==(a.length()-1))
			System.out.print("increase"+" "+val);
		else
			System.out.print("invalid");
	}

}
