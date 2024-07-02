package wipro_training;

public class hypnosispattern {
	public static void main(String []args) {
		int n=5;
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i==1 || j==2*n-1 || i==2*n-1 || j==1) 
					System.out.print("5");
				else if(i==2 || j==2*n-2 || i==2*n-2 || j==2 )
					System.out.print("4");
				else 
					System.out.println(" ");
			}
			System.out.println("");
	}
	}
}

