package wipro_training;

public class dist_of_twosamenumbers {
	public static void main(String []args) {
		int a[]= {10,20,30,10,30,20},temp=0,dist=-1,num=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					temp=j-i;
				}
			}
			if(temp>dist) {
				dist=temp;
				num=a[i];
			}
		}
		System.out.print(num+" "+dist);
		
	}

}
