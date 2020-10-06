package javamock11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main5 {
	
	public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of colleges");
        int n=sc.nextInt();
        List<College> collegeList=new ArrayList<College>();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        for(int i=0;i<n;i++)
        {
        	String input=sc.nextLine();
            if(input.equals(""))
                input=sc.nextLine();
            College college=College.createCollege(input);
            collegeList.add(college);
        }
        System.out.println("Enter a type to sort:\r\n"
        		+ "1.Sort by name\r\n"
        		+ "2.Sort by number of departments\r\n"
        		+ "3.Sort by starting date\r\n"
        		+ "");
        int choice=sc.nextInt();
        //List<College> sortedCollegeList;
        switch(choice)
        {
        case 1: Collections.sort(collegeList);
        		break;
        case 2:Collections.sort(collegeList,new DepartmentComparator());
				break;
        case 3:Collections.sort(collegeList,new StartingDateComparator());
				break;
        default:System.out.println("Invalid choice");
    			break;
        }
        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
        for(College college:collegeList)
        System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", college.getName(),college.getWebsite(),college.getMobile(),college.getFounder(),college.getNo_of_dept(),college.getLocation(),sdf.format(college.getStartingDate()));
        
    
	}
}
