package com.tns.datetime;

//import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Exaample6 {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(t);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}

	}

}
