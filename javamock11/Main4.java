package javamock11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class Main4 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of colleges");
		int n=sc.nextInt();
		List<College> collegeList=new ArrayList<College>();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		for(int i=0;i<n;i++)
		{
			String input=sc.nextLine();
            if (input.equals(""))
            	input=sc.nextLine();
            College college=College.createCollege(input);
            collegeList.add(college);
        }
		System.out.println("Enter a search type: \n1.By name\n2.By starting date\n3.By location\n");
		int choice=sc.nextInt();
		CollegeBO cb=new CollegeBO();
		List<College> findList=Collections.emptyList();
		switch(choice)
		{
		case 1:System.out.println("Enter number of names");
				int num=sc.nextInt();
				ArrayList<String> nameList=new ArrayList<String>();
				for(int i=0;i<num;i++)
				{
					String input1=sc.nextLine();
					if (input1.equals(""))
						input1=sc.nextLine();
					nameList.add(input1);
				}
				findList=cb.findCollege(collegeList,nameList);
				break;
				
		case 2:System.out.println("Enter the starting date:");
		      	String sdate=sc.next();
		      	Date startingDate=sdf.parse(sdate);
		      	findList=cb.findCollege(collegeList, startingDate);
		      	break;
		      	
		case 3:System.out.println("Enter the location:");
		       String location=sc.nextLine();
		       if(location.equals(""))
		    	   location=sc.nextLine();
		       findList=cb.findCollege(collegeList,location);
		       break;
		
	    default:System.out.println("Invalid Selection");
	            break;
		}
		
		if(findList.isEmpty())
        	System.out.println("No Such college is present");
        else 
        {
        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Mobile","Founder","No of departments","Location","Starting date");
        for(College college:findList)
        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", college.getName(),college.getWebsite(),college.getMobile(),college.getFounder(),college.getNo_of_dept(),college.getLocation(),sdf.format(college.getStartingDate()));
        }
	}

}
