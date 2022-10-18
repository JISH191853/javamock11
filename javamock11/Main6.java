package javamock11;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of colleges");
        int n=sc.nextInt();
        List<College> collegeList=new ArrayList<College>();
        for(int i=0;i<n;i++)
        {
        	String input=sc.nextLine();
            if(input.equals(""))
                input=sc.nextLine();
            College college=College.createCollege(input);
            collegeList.add(college);
        }
        Map<String,Integer> countLoc=College.calculateLocationCount(collegeList);
        System.out.format("%-15s ,"Location");
        for(Map.Entry<String, Integer> e:countLoc.entrySet())
        {
        	System.out.format("%-15s %s\n",e.getKey(),e.getValue());
        }

	}

}
