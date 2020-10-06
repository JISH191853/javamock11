package javamock11;

import java.util.Scanner;

import java.util.regex.Pattern;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Validate Website\r\n"
				+ "2.Validate Mobile number\r\n"
				+ "");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter the Website to be validated:");
				String website=sc.next();
				if(validateWebsite(website))
					System.out.println("Website is valid\r\n"
							+ "\r\n"
							+ "");
				else
					System.out.println("Website is invalid");
				break;
		case 2:System.out.println("Enter the MobileNo. to be validated:");
				String mobile=sc.next();
			if(validateMobile(mobile))
				System.out.println("Mobile Number is valid");
			else
				System.out.println("Mobile Number is invalid");
				break;
				
		}
		
		
		

	}
	static Boolean validateWebsite(String website)
	{
		return Pattern.matches("(http){1}s{0,1}(://){1}(www[.]){0,1}[a-zA-z]+[.]{1}[a-z]{2,6}([.][a-z]{2,6}){0,1}", website);  

	}
	static Boolean validateMobile(String mobileNo)
	{
		return Pattern.matches("([+]91){1}[0-9]{10}",mobileNo);
	}
}
