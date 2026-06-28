package practiceCode;

import java.util.HashMap;

public class Practice 
{
	public static void main(String[] args) {
		
		int a = 1234;
		int revnum = 0 ;

		for (int i = a ; i>0 ; i = i/10)
		{
		  int rem = i%10;
		  
		  revnum = revnum *10 + rem;
		  }
		  
		  System.out.println(revnum);
	}

}


