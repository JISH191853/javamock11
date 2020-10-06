//REQUIREMENT 2

package javamock11;

import java.text.SimpleDateFormat;
import java.util.List;

public class University {

	private String name;
	private List<College> collegeList;
	
	public University() { }

	public University(String name, List<College> collegeList) {
		super();
		this.name = name;
		this.collegeList = collegeList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<College> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	
	public void addCollegeToUniversity(College college) 
	{
		collegeList.add(college);
	}
	
	public Boolean removeCollege(String name) 
	{
		for(College c:collegeList)
		{
			if(c.getName().equalsIgnoreCase(name))
			{
				collegeList.remove(c);
				return true;
			}
	    }
		return false;
	}
	
	public void displayColleges()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		if(collegeList.isEmpty())
		{
			System.out.println("No colleges to show");
		}
		else 
		{
			
			System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", "Name","Website","Mobile","Founder","Number of Dept","Location","Starting Date");
			for(College c:collegeList)
				System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n",c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNo_of_dept(),c.getLocation(),sdf.format(c.getStartingDate()));
		}
	}

}
