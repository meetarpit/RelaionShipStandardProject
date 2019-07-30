package com.test.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int depId;
    private String name;
    
//    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//    private List<Employee>employee=new ArrayList<Employee>();
//    
//    
//    
//	public List<Employee> getEmployee() {
//		return employee;
//	}
//	public void setEmployee(List<Employee> employee) {
//		this.employee = employee;
//	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [depId=" + depId + ", name=" + name + "]";
	}
    
    
}
