package com.cts.MLEU.EmplRestFulService.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.MLEU.EmplRestFulService.Model.Employee;

public interface EmployeeJpaDao extends JpaRepository<Employee, Integer> {

	List<Employee> findByName(String name);

	List<Employee> findByNameIs(String name);

	List<Employee> findByNameEquals(String name);

	List<Employee> findByNameIsNull();

	List<Employee> findByNameNot(String name);

	List<Employee> findByNameIsNot(String name);

	List<Employee> findByNameIsNotNull();

	List<Employee> findByNameStartingWith(String name);

	List<Employee> findByNameEndingWith(String name);

	List<Employee> findByNameContaining(String name);

	List<Employee> findByNameLike(String name);

	List<Employee> findBySalaryLessThan(Integer Salary);

	List<Employee> findBySalaryLessThanEqual(Integer Salary);

	List<Employee> findBySalaryGreaterThan(Integer Salary);

	List<Employee> findBySalaryGreaterThanEqual(Integer Salary);

	List<Employee> findBySalaryBetween(Integer startSalary, Integer endSalary);

	List<Employee> findAllByOrderByName();

	List<Employee> findAllByOrderByNameDesc();

	List<Employee> findAllByOrderBySalary();

	List<Employee> findAllByOrderBySalaryDesc();

}
