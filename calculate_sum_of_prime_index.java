package wipro_training;

public class calculate_sum_of_prime_index {
	public static void main(String args[]) {
		int ar[]= {10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(isprime(i)) sum=sum+ar[i];
		}
		System.out.println(sum);
	}
	
	public static boolean isprime(int num) {
		int flag=0;
		if(num == 0 || num == 1) return false;
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {flag=1;break;}
				}
			if(flag==0) return true;
			else return false;
		}
	}

}
