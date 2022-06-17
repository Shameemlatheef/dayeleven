package com.day112;

import java.util.Scanner;

public class IPL {
	void homeTeamStadium(Stadium stadium) {
		switch(stadium) {
		
		
		case EDENGARDENS:{
		System.out.println("hoem ground of kkr");
		break;
		}
		case CHINNSWAMY:{
			System.out.println("home of chennai");
			break;
		}
		case CHIDAMBARAM :{
			System.out.println("home o banglore");
			break;
		}
		case WANGADE :{
			System.out.println("home id mumbai");
			break;
		}
		}
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String m=s.next();
		IPL F=new 	IPL();
		
		if(m.equalsIgnoreCase("EDENGARDENS")) {
			F.homeTeamStadium(Stadium.EDENGARDENS);
		}
		if(m.equalsIgnoreCase("wangade")) {
			F.homeTeamStadium(Stadium.WANGADE);
		}
		if(m.equalsIgnoreCase("chinnaswamy")) {
			F.homeTeamStadium(Stadium.CHINNSWAMY);
		}
		if(m.equalsIgnoreCase("chidambaram")) {
			F.homeTeamStadium(Stadium.CHIDAMBARAM);
		}
		
	}
}
