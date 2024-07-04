package wipro_training;

public class weight_of_sentence {

	public static void main(String[] args) {
		String sen="Wipro Limited";
		int input1[]= {15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
		String ar []= sen.split(" ");int sum=0,wei=1;
		for(int i=0;i<ar.length;i++) {
			ar[i]=ar[i].toLowerCase();
			for(int j=0;j<ar[i].length();j++) {
				int s=ar[i].charAt(j)-96;
				sum=sum+input1[s-1];
				if(j==ar[i].length()-1 && input1[s-1]<0) sum=sum+s;
			}
			wei=wei*sum;sum=0;
		}
		System.out.println(wei);
	}

}
