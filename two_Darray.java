package wipro_training;

public class two_Darray {
	public static void main(String args[]) {
		int a[][]= {{2,5,1},{6,7,4},{1,8,6}};
		int b[][]=new int[4][4];
		int g=0,i,j;
		for(i=0;i<a.length;i++) {
			g=0;
			for(j=0;j<a.length;j++) { 
				b[i][j]=a[i][j];
				if(a[i][j]>g) {g=a[i][j];}
			}
			b[i][j]=g;
		}
		
		for(i=0;i<b.length;i++) {
			 g=b[0][i];
			for(j=0;j<b.length-1;j++) {
				if(b[j][i]<g) {g=b[j][i];}
			}
			b[j][i]=g;
		}
		
		for(i=0;i<b.length;i++) {
			for(j=0;j<b.length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
