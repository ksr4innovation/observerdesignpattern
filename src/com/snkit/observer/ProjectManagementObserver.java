package com.snkit.observer;

public class ProjectManagementObserver implements Observer {

	
	Subject subject;
	
	public ProjectManagementObserver(Subject sub){		
		this.subject = sub;
		this.subject.register(this);		
	}
	
	
	@Override
	public void update() {
		System.out.println("   This is from   ProjectManagementObserver   "+((Employee)subject.getUpdate()).getEmpid());

	}



}
