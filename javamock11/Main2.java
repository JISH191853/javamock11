package javamock11;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		List<College> collegeList=new ArrayList<College>();
		System.out.println("Enter the name of Universities");
		String uname=sc.nextLine();
        University u=new University(uname,collegeList);
        while(true)
        {
        	System.out.println("1.Add college \r\n"
        	+"2.Remove college \r\n"
        	+"3.Display college \r\n"
        	+"4.Exit \r\n"
        	+ "");
        	int choice=sc.nextInt();
        	switch(choice)
        	{
        	case 1:String input=sc.nextLine();
        			if(input.equals(""))
        				input=sc.nextLine();
        				College college=College.createCollege(input);
        				u.addCollegeToUniversity(college);
        				System.out.println("College successfully added");
        				break;
        	case 2:System.out.println("Enter the college name to be deleted");
        		   String input1=sc.nextLine();
        			if(input1.equals(""))
        				input1=sc.nextLine();
        			if(u.removeCollege(input1))
        				System.out.println("College successfully deleted");
        			else
        				System.out.println("College not found in the University");
					break;
        	case 3:System.out.println("Colleges in "+u.getName());
			       u.displayColleges();
			       break;
	        default:System.exit(0);
           }
        	
        }
	}

}
