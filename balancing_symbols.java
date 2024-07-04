package wipro_training;

public class balancing_symbols {

	public static void main (String[] args) {
		String input="(((()))";
		char stack[]=new char[input.length()];
		int top=-1;
		if(input.charAt(0)=='}' || input.charAt(0)==')' || input.charAt(0)==']') {
			System.out.println(false);
		}
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[') {
				stack[++top]=ch;
			}
			else {
				switch(ch) {
					case ')':
						if(stack[top]=='(') top--;
						else {
							System.out.println("false.");
							return ;
						}
						break;
					case ']':
						if(stack[top]=='[') top--;
						else{
							System.out.println("false..");
							return ;
						}
						break;
					case '}':
						if(stack[top]=='{') top--;
						else{
							System.out.println("false...");
							return ;
						}
						break;
				}
			}
		}
		if(top==-1) System.out.println(true);
		else System.out.println(false);
		
	}

}
