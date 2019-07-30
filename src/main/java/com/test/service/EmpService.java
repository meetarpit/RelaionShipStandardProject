package com.test.service;

import java.util.List;

import com.test.model.Department;
import com.test.model.Employee;

public interface EmpService {
	public void create(Employee emp);
	public void update(Employee emp);
    public void delete(Employee emp);
    public Employee find(int id);
    public List<Employee>getAll();
    public void createNewDep(Department department);
    public List<Department>getAllDep();
}
