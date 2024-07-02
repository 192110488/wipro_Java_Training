package wipro_training;

public class secondndmax {
	public static void main(String []args) {
		int a[]= {10,20,1,23,27};
		int max=a[0],smax=-1,flag=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
			}
			else if(flag==0 && a[i]<max) {
				smax=a[i];
				flag=1;
			}
			else  if(a[i]<max && a[i]>smax){
				smax=a[i];
			}
		}
		System.out.print("second max= "+smax);
	}
}
