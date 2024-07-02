package wipro_training;

public class union_except_intersect {
	public static void main(String []args) {
		int a[]= {1,2,5,3,8,9};
		int b[]= {1,7,5,8,8};
		int inter[]=new int[10],k=0,l,i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					inter[k++]=a[i];
					break;
				}
			}
		}
		for(l=0;l<k;l++) {
			System.out.print(inter[l]+" ");
		}
	}

}
