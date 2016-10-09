public class Division{
	public static void main(String[] args) {
		int n1 , n2;
		
		int i = 0;
		int N1;
		int temp;
		boolean s1 = true;
		boolean s2 = true;
		

		System.out.println("Enter 2 numbers");
		n1 = Integer.parseInt(System.console().readLine());
		n2 = Integer.parseInt(System.console().readLine());
		

		if (n2 == 0){
		System.out.println("impossible");
		return;
		}
		
		if (n1 == 0){
		System.out.println(n1 + " divided by " + n2 + " is always 0 ");		
		return;
		}
		

		if (n1 <0){
		n1 = -n1;
		s1 = false;
		}

		if (n2 <0){
		n2 = -n2;
		s2 = false;
		}


		if (n2 > n1){
		temp = n1;
		n1 = n2;
		n2 = temp;
		}
		N1 = n1;
		
		while(n1 >= n2){
		n1 = n1 - n2;
		i++;
		}
		
		/*if(((s1 == true) && (s2 == false)) || ((s2 == true) && (s1 == false)))
		i = -i;*/
		
		System.out.println(N1 + " divided by " + n2 + " is " + i + " and the remainder is " + n1);
		
	}		
}
