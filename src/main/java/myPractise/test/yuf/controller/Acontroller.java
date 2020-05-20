package myPractise.test.yuf.controller;

import myPractise.test.yuf.annotation.TabResource;

@TabResource("A表现层")
public class Acontroller {
	
	@TabResource("A-hi")
	public void hi(){
		System.out.println("A表现层的hi方法");
	}
}
