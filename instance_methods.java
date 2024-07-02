package wipro_training;
import java.util.*;
public class instance_methods {
	public  static int  values(int a, int b) {
		if(a>b)
			return b;
		else
			return a;
	}
	public static void main(String []args) {
		Scanner obj= new Scanner(System.in);
		int n1=obj.nextInt();
		int n2=obj.nextInt();
		//instance_methods val=new instance_methods();
		int result = values(n1,n2);
		System.out.print(result);
	}

}
