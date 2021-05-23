package com.cognizant.truyum.utility;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  

public class DateUtil {

	public static Date convertToDate(String s) 
	{
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy");

		Date date;
		try 
		{
			
			date = simpleDateFormat.parse(s);
			return date;
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		
		return null;
		
	}
}
