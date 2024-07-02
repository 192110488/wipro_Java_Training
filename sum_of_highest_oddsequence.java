package wipro_training;

public class sum_of_highest_oddsequence {
	public static void main(String args[]) {
		int a[]= {32,33,25,97,12,18,13,15,17,19,0,4,32,9,7,78,79};
		int temp=0,sum=0,count=0,tsum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				temp++;
				sum=sum+a[i];
			}
			else {
				if(temp>count) {
				count=temp;
				tsum=sum;
				}
				else if(temp==count)
				{
					tsum=tsum+sum;
				}
				temp=0;sum=0;
			}
		}
		System.out.print(tsum);
	}

}
