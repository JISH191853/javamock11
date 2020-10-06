package javamock11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollegeBO {
	public List<College> findCollege(List<College> collegeList,List<String> nameList)
	{
		List<College> findList=new ArrayList<College>();
		for(College college:collegeList)
		{
			if(nameList.indexOf(college.getName())!=-1)
				findList.add(college);
		}
		return findList;
	}
	
	public List<College> findCollege(List<College> collegeList,Date startingDate)
	{
		List<College> findList=new ArrayList<College>();
		for(College college:collegeList)
		{
			if((college.getStartingDate()).equals(startingDate));
				findList.add(college);
		}
		return findList;
	}
	
	
	public List<College> findCollege(List<College> collegeList, String location)
	{
		List<College> findList=new ArrayList<College>();
		for(College college:collegeList)
		{
			if((college.getLocation()).equals(location))
				findList.add(college);
		}
		return findList;
	}

}
