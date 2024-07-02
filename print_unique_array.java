package wipro_training;

public class print_unique_array {
	public static void main(String []args) {
		int a[]= {10,20,30,10,40,20,50,60,10,30};
		int b[]=new int[a.length],flag=0,k=0;
		for(int i=0;i<a.length;i++) {
			flag=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				b[k++]=a[i];
			}	
		}
		for(int i=0;i<k;i++) {
			System.out.print(b[i]+",");
		}
	}
}
