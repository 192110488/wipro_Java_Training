package wipro_training;
import java.util.*;
public class sumof_elements_skipbtw_a_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,6,1,2,7,2},sum=0,j;
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt(),b=obj.nextInt();
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=a)
				sum=sum+ar[i];
			else if(ar[i]==a) {
				j=i;
				while(j!=b)
					j++;
				i=j;
			}
		}
	}

}
