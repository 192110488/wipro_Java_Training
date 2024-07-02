package wipro_training;

public class nonZero_follows_Zeros {
	public static void main(String []args) {
		int a[]= {0,10,20,0,-5,0,5,0,0},k=0;
		int ans[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				ans[k++]=a[i];
			}
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
	}

}
