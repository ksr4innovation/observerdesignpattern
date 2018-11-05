package com.snkit.observer;

import java.util.ArrayList;
import java.util.List;

public class SnkitSubject implements Subject {

	private List<Observer> observers;
	
	private Employee message;

	public SnkitSubject() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer obj) {
		if (obj == null)
			throw new NullPointerException("Null Observer");
		observers.add(obj);
	}

	@Override
	public void unregister(Observer obj) {

		observers.remove(obj);

	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;

		observersLocal = new ArrayList<>(this.observers);

		for (Observer obj : observersLocal) {
			obj.update();
		}

	}

	@Override
	public Object getUpdate() {
	
		return this.message;
	}
	
	public void postMessage(Employee emp) {
		
		this.message = emp;
		
		notifyObservers();
	}

}
