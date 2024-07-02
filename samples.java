public class samples {
    public int v(String in) {
         String a[]=in.split(" ");
         int i=0,count=0;
         while(i<a.length) {
        	 String a1=a[i];
        	 int j=1,flag=0;
        	 while(j<a1.length()) {
        		 if(a1.charAt(j)<a1.charAt(j-1)) {
        			 flag=1;
        			 break;
        		 }
        		 j++;
        	 }
        	 if(flag==0) count++;
         }
         return count;
    }
    public static void main(String []args) {
    	samples s=new samples();
    	s.v("abc def");
    }
}