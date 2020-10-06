package javamock11;
import java.text.ParseException;


import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class College implements Comparable<College>{
		private String name;
		private String website;
		private String mobile;
		private String founder;
		private Integer no_of_dept;
		private String location;
		private Date startingDate;
		
		public College() {}

		public College(String name, String website, String mobile, String founder, int no_of_dept, String location,
				Date startingDate) {
			this.name = name;
			this.website = website;
			this.mobile = mobile;
			this.founder = founder;
			this.no_of_dept = no_of_dept;
			this.location = location;
			this.startingDate = startingDate;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getFounder() {
			return founder;
		}

		public void setFounder(String founder) {
			this.founder = founder;
		}

		public int getNo_of_dept() {
			return no_of_dept;
		}

		public void setNo_of_dept(int no_of_dept) {
			this.no_of_dept = no_of_dept;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public Date getStartingDate() {
			return startingDate;
		}
		public String getStartingDate1()
	    {
	        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	        return sdf.format(startingDate);
	    }

		public void setStartingDate(Date startingDate) {
			this.startingDate = startingDate;
		}
		
		public static College createCollege(String detail)throws ParseException {           //REQUIREMENT 2,4,5,6 method
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			String arr[]=detail.split(",");
			Date startingDate1=sdf.parse(arr[6]);
			College college=new College(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], startingDate1);
			return college;
		}

		@Override                                                                  //REQUIREMENT 1 method
		public String toString() {
			String output="";
			output=String.format("Name: %s\nWebsite: %s\nMobile: %s\nFounder: %s\nNumber of department: %s\nLocation: %s\nStarting date: %s",name,website,mobile,founder,no_of_dept,location,startingDate);
	        return output;	
		}

		@Override                                                                  //REQUIREMENT 1 method
		public boolean equals(Object obj) {
			College arg=(College) obj;
	        return this.getName().equalsIgnoreCase(arg.getName()) && this.getStartingDate().equals(arg.getStartingDate());
		}
		
		@Override                                                                     //REQUIREMENT 5 method
		public int compareTo(College arg)
		{
			return this.getName().compareTo(arg.getName());
		}
		
		
		public static Map<String,Integer> calculateLocationCount(List<College> list)    //REQUIREMENT 6 method
		{
			Map<String,Integer> countLoc=new TreeMap<String,Integer>();
			for(College c:list) {
				if(countLoc.containsKey(c.getLocation()))
					countLoc.put(c.getLocation(),countLoc.get(c.getLocation())+1);
				else
					countLoc.put(c.getLocation(),1);
			}
			
			return countLoc;
			
		}	
		}
		
		

