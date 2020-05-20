package myPractise.test.yuf.controller;

import myPractise.test.yuf.annotation.TabResource;

@TabResource("C表现层")
public class Ccontroller {
	
//	@TabResource("C-xx")
	@TabResource()
	public void xx(){
		System.out.println("C表现层的xx方法");
	}
}
