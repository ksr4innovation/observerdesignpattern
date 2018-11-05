package com.snkit.observer;

public class PayrollObserver implements Observer {
	
	private Subject subject;
	
	public PayrollObserver(Subject sub){		
		this.subject = sub;
		this.subject.register(this);		
	}
	

	@Override
	public void update() {
		System.out.println("   This is from   PayrollObserver   "+((Employee)subject.getUpdate()).getEmpid());

	}



}
