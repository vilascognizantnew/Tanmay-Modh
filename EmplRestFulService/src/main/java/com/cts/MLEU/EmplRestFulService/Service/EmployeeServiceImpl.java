package com.cts.MLEU.EmplRestFulService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.MLEU.EmplRestFulService.Dao.EmployeeJpaDao;
import com.cts.MLEU.EmplRestFulService.Model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeJpaDao employeeRepo;
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).get();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee,int id) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findByName(name);
	}

	@Override
	public List<Employee> findByNameIs(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findByNameIs(name);
	}

	@Override
	public List<Employee> findByNameEquals(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findByNameEquals(name);
	}

	@Override
	public List<Employee> findByNameIsNull() {
		// TODO Auto-generated method stub
		return employeeRepo.findByNameIsNull();
	}

	@Override
	public List<Employee> findByNameNot(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findByNameNot(name);
	}

	@Override
	public List<Employee> findByNameIsNot(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findByNameIsNot(name);
	}

	@Override
	public List<Employee> findByNameIsNotNull() {
		// TODO Auto-generated method stub
		return employeeRepo.findByNameIsNotNull();
	}

	@Override
	public List<Employee> findByNameStartingWith(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findByNameStartingWith(name);
	}

	@Override
	public List<Employee> findByNameEndingWith(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findByNameEndingWith(name);
	}

	@Override
	public List<Employee> findByNameContaining(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findByNameContaining(name);
	}

	@Override
	public List<Employee> findByNameLike(String name) {
		// TODO Auto-generated method stub
		return employeeRepo.findByNameLike(name);
	}

	@Override
	public List<Employee> findBySalaryLessThan(Integer Salary) {
		// TODO Auto-generated method stub
		return employeeRepo.findBySalaryLessThan(Salary);
	}

	@Override
	public List<Employee> findBySalaryLessThanEqual(Integer Salary) {
		// TODO Auto-generated method stub
		return employeeRepo.findBySalaryLessThanEqual(Salary);
	}

	@Override
	public List<Employee> findBySalaryGreaterThan(Integer Salary) {
		// TODO Auto-generated method stub
		return employeeRepo.findBySalaryGreaterThan(Salary);
	}

	@Override
	public List<Employee> findBySalaryGreaterThanEqual(Integer Salary) {
		// TODO Auto-generated method stub
		return employeeRepo.findBySalaryGreaterThanEqual(Salary);
	}

	@Override
	public List<Employee> findBySalaryBetween(Integer startSalary, Integer endSalary) {
		// TODO Auto-generated method stub
		return employeeRepo.findBySalaryBetween(startSalary, endSalary);
	}

	@Override
	public List<Employee> findAllByOrderByName() {
		// TODO Auto-generated method stub
		return employeeRepo.findAllByOrderByName();
	}

	@Override
	public List<Employee> findAllByOrderByNameDesc() {
		// TODO Auto-generated method stub
		return employeeRepo.findAllByOrderByNameDesc();
	}

	@Override
	public List<Employee> findAllByOrderBySalary() {
		// TODO Auto-generated method stub
		return employeeRepo.findAllByOrderBySalary();
	}

	@Override
	public List<Employee> findAllByOrderBySalaryDesc() {
		// TODO Auto-generated method stub
		return employeeRepo.findAllByOrderBySalaryDesc();
	}

	

}
