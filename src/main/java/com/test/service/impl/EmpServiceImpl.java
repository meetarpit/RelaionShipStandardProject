package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.EmpDao;
import com.test.model.Department;
import com.test.model.Employee;
import com.test.service.EmpService;

@Service
@Transactional
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDao empDao;
	
	public void create(Employee emp) {
		// TODO Auto-generated method stub
		empDao.create(emp);
	}

	public void update(Employee emp) {
		// TODO Auto-generated method stub
		empDao.update(emp);
	}

	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		empDao.delete(emp);
	}

	public Employee find(int id) {
		// TODO Auto-generated method stub
		return empDao.find(id);
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return empDao.getAll();
	}

	public void createNewDep(Department department) {
		// TODO Auto-generated method stub
		empDao.createNewDep(department);
	}

	public List<Department> getAllDep() {
		// TODO Auto-generated method stub
		return empDao.getAllDep();
	}

}
