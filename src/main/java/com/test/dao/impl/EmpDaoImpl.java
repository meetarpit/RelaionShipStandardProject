package com.test.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.EmpDao;
import com.test.model.Department;
import com.test.model.Employee;

@Repository
@Transactional
public class EmpDaoImpl implements EmpDao{

	
	@Autowired
	SessionFactory  sessionFactory;
	
	public Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void create(Employee emp) {
		// TODO Auto-generated method stub
		 currentSession().save(emp);
	}

	public void update(Employee emp) {
		// TODO Auto-generated method stub
		currentSession().update(emp);
	}

	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		currentSession().delete(emp);
	}

	public Employee find(int id) {
		// TODO Auto-generated method stub
		return (Employee) currentSession().get(Employee.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return currentSession().createCriteria(Employee.class).list();
	}

	public void createNewDep(Department department) {
		// TODO Auto-generated method stub
		currentSession().save(department);
	}

	@SuppressWarnings("unchecked")
	public List<Department> getAllDep() {
		// TODO Auto-generated method stub
		return currentSession().createCriteria(Department.class).list();
	}

}
