package wipro_training;

public class nonzero_manipulation {
	public static void main(String []args) {
		int a[]= {0,10,40,0,-5,0,5,0,0};
		for(int i=0;i<a.length;i++) {
			 if(a[i]!=0) {
				 for(int j=0;j<i;j++) {
					 if(a[j]==0) {
						 a[j]=a[i];
						 a[i]=0;
						 break;
					 }
				 }
			 }
		}
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+",");
		}
	}

}
