package wipro_training;

public class highestfreq_and_itscount {
	public static void main(String []args) {
		int a[]= {-1,-2,-3,-1,-2,-4,-5,-1,-2};
		int num=-1,count=1,temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					temp++;
				}
			}
			if(temp>count) {
				count=temp;
				num=a[i];
			}
			else if(temp==count && a[i]<num) {
				num=a[i];
			}
		}
		if(count==1)
			System.out.print(num);
		else
			System.out.print("number with high freq= "+num+"\ncount= "+count);
	}
}