package myPractise.test.yuf.controller;

import myPractise.test.yuf.annotation.TabResource;

@TabResource("B表现层")
public class Bcontroller {
	
	@TabResource("B-hi")
	public void hi(){
		System.out.println("B表现层的hi方法");
	}
	@TabResource("B-hehe")
	public void hehe(){
		System.out.println("B表现层的hehe方法");
	}
}
