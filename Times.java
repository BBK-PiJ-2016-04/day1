public class Times{
	public static void main(String[] args) {
		int temp = 0;
		int i = 0;
		int m1 , m2;
		int M1, M2;
		
		boolean s1 = true;
		boolean s2 = true;

		System.out.println("Enter 2 number to multiply");
		m1 = Integer.parseInt(System.console().readLine());
		m2 = Integer.parseInt(System.console().readLine());
		if (m1 < 0 ) 
		{M1 = -m1;
		 s1 = false;
		}
		else M1 = m1;
		if (m2 < 0)
		{M2 = -m2;
		 s2 = false;
		}
		else M2 = m2;
		
				
		for (i =0; i < M2; i++){
			temp = temp + M1;
		}
		if (((s1 == false) && (s2 == true)) || ((s2 == false) && (s1 == true)))
			temp = -temp;
		System.out.println("the result is " + temp);
		
	}		
}
