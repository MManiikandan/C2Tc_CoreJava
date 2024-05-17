package com.mmanikandan.assignment1.employees;

public class Developer extends Empolyee {
  
	private String currentProject;
    private String programmingLanguage;
    
	/**
	 * @param name
	 * @param employeeId
	 * @param salary
	 * @param currentProject
	 * @param programmingLanguage
	 */
	public Developer(String name, int employeeId, double salary, 
			         String currentProject, String programmingLanguage) {
		super(name, employeeId, salary);
		this.currentProject = currentProject;
		this.programmingLanguage = programmingLanguage;
	}
	/**
	 * @return the currentProject
	 */
	public String getCurrentProject() {
		return currentProject;
	}
	/**
	 * @param currentProject the currentProject to set
	 */
	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}
	/**
	 * @return the programmingLanguage
	 */
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	/**
	 * @param programmingLanguage the programmingLanguage to set
	 */
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
    
}
