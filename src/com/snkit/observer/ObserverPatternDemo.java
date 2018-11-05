package com.snkit.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
	
		
		SnkitSubject  sub = new SnkitSubject();
		
		HRObserver  hrobserver = new HRObserver(sub);
		
		PayrollObserver payobserver =new  PayrollObserver(sub);
		
		ProjectManagementObserver    projobserver = new ProjectManagementObserver(sub);
		
		
		sub.postMessage(new Employee("12345","srinu","demo"));
		
		sub.postMessage(new Employee("12345778","srinutestes","demo"));

	}

}
