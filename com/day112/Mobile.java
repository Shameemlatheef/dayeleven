package com.day112;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
	public void searchOutdatedModel(String name,String... values) {
		System.out.println(name);
		for(String x:outdatedModels) {
			for(String y:values) {
				if(x==y) {
					System.out.println("model is outdated "+y);
				
				}
				else {
					System.out.println(name+"Fresh arrival");
				}
			}
		}
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.searchOutdatedModel("samsung","note5");
		m.searchOutdatedModel("nokia", "note5","note6");
		
	}
}
