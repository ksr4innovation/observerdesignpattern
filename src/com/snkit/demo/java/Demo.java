package com.snkit.demo.java;

public class Demo {
	
	// Constructor injection
	EmployeeService service ;
	
	// Setter injection
	DeptService dService;
	
	Demo(EmployeeService employeeService ){
		 this.service = service; 
	}
	
	Demo( ){
		 this.service = service; 
	}

	
	


	public DeptService getdService() {
		return dService;
	}

	public void setdService(DeptService dService) {
		this.dService = dService;
	}

	public static void main(String[] args) {
		
		Demo d = new Demo( );
	//	d.deptService.showdept();
		
		/*
		  
		 construction injection
		  
		 Demo d;
		try {
			
			
			d = new Demo(new EmployeeService());
			d.service.sayHI();
		} catch (Exception e) {
			
			e.printStackTrace();
		}*/
		
		

	}

}
