package com.snkit.observer;

public class HRObserver implements Observer {
	
	Subject subject;
	
	public HRObserver(Subject sub){		
		this.subject = sub;
		this.subject.register(this);		
	}

	@Override
	public void update() {
		System.out.println("   This is from   HRObserver   "+((Employee)subject.getUpdate()).getEmpid());

	}



}
