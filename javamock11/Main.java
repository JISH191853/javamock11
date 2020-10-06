package javamock11;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter college 1 detail:");
        String detail1=sc.nextLine();
        System.out.println("Enter college 2 detail:");
        String detail2=sc.nextLine();
        String[] arr1 = detail1.split(",");
        //how to convert a String into a Date
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        Date startingDate1=sdf.parse(arr1[6]);
        College college1=new College(arr1[0], arr1[1], arr1[2], arr1[3], Integer.parseInt(arr1[4]), arr1[5], startingDate1);
        String[] arr2 = detail2.split(",");
        Date startingDate2=sdf.parse(arr2[6]);
        College college2=new College(arr2[0], arr2[1], arr2[2], arr2[3], Integer.parseInt(arr2[4]), arr2[5], startingDate2);
        System.out.println(college1);
        System.out.println(college2);
        if(college1.equals(college2))
            System.out.println("College 1 is same as College 2");
        else
            System.out.println("College 1 and College 2 are different");
    }
}

	
