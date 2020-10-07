package com.training.utils;

import java.sql.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class UsingLocalDate {
	
	public static void main(String[] args)
	{
//		LocalDateTime curentTime =LocalDateTime.now();
//		System.out.println(curentTime);
//		System.out.println(curentTime.getDayOfMonth());
//		System.out.println(curentTime.getYear());
//		
//		LocalDate today=LocalDate.now();
//		LocalDate birthday=LocalDate.of(1996, 05, 16);
////		Duration duration=Duration.between(today, birthday);
//		 Period duration =Period.between(birthday,today );
//		System.out.println(duration);
////		System.out.println(duration.toDays());
//		System.out.println("Days: "+duration.getDays());
//		System.out.println("Months: "+duration.getMonths());
//		
//		System.out.println("Year: "+duration.getYears());
		
		
	java.util.Date date=new java.util.Date();
	
	Date sqldate=new java.sql.Date (date.getTime());
	LocalDate sqlToLocal=sqldate.toLocalDate();
	
	System.out.println(sqldate);
	System.out.println(sqlToLocal);
	
	LocalDate toSql=LocalDate.of(2008,5,15);
	Date frmLocal=Date.valueOf(toSql);
	System.out.println(frmLocal);
	
	
	
	
	}

}
