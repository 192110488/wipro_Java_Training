package wipro_training;

public class freqcount_print_withoutrepeat {
	public static void main(String []args) {
		int a[]= {10,20,30,10,40,10,30,30};
		int count=0,k,i,j;
		for(i=0;i<a.length;i++) {
			count=0;
				for(k=0;k<i;k++) {
					if(a[k]==a[i])
						break;
				}
				if(i==k) {
					for(j=0;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					}
					
				}
				System.out.print(a[i]+"-->"+count+"\n");
			}
			}
	}

}
