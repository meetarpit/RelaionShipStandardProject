package com.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.model.Department;
import com.test.model.Employee;
import com.test.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("emp",new Employee());
		model.addAttribute("dep",new Department());
		return "index";
	}
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String create(Employee emp) {
		empService.create(emp);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("emp",empService.getAll());
		System.out.println("EmpList"+empService.getAll());
		return "empList";
	}
	
	@RequestMapping(value="/saveDep",method=RequestMethod.POST)
	public String createDep(Department dep) {
		System.out.println("dep123"+dep.getDepId()+" "+dep.getName());
		empService.createNewDep(dep);
		return "redirect:/";
	}
	@ModelAttribute("countryList")
	   public Map<String, List<Department>> getCountryList(Model model) {
	      Map<String, List<Department>> countryList = new HashMap<String, List<Department>>();
	  	List<Department>dep=empService.getAllDep();
	  	countryList.put("dep",dep);
	  	  System.out.println("countryList"+countryList);
	      return countryList;
	   }
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String editEmp(@PathVariable("id")int id,Model model) {
		Employee emp=empService.find(id);
		model.addAttribute("emp",emp);
		return "edit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(Employee emp) {
		empService.update(emp);
		return "redirect:/list";
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteEmp(@PathVariable("id")int id,Employee emp) {
		empService.delete(emp);
		return "redirect:/list";
	}
	
}
