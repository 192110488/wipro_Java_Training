package wipro_training;

public class arrayele_cross_printing {
	public static void main(String args[]) {
		int a[][]= {{44}};
		for(int i=0;i<=2*(a.length-1);i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					if(j+k==i) {
						System.out.print(a[j][k]+" ");
					}
				}
			}
		}
		//System.out.print(a.length);
	}
 
}
