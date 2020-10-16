package com.cts.MLEU.EmplRestFulService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.MLEU.EmplRestFulService.Model.Employee;
import com.cts.MLEU.EmplRestFulService.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/employeeList")
	public ResponseEntity<Object> employeeList(){
		return new ResponseEntity<>(empService.getAllEmployees(),HttpStatus.OK);
	}
	
	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<Object> getEmployee(@PathVariable("id") int id){
		return new ResponseEntity<>(empService.getEmployeeById(id),HttpStatus.OK);
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee emp){
		return new ResponseEntity<>(empService.addEmployee(emp),HttpStatus.OK);
	}
	
	@PutMapping("/updateEmployee")
	public ResponseEntity<Object> updateEmployee(@RequestBody Employee emp){
		// ONE WAY TO UPDATE
		Employee employee = empService.updateEmployee(emp,emp.getId());
		if(employee!= null)
			return new ResponseEntity<>(employee,HttpStatus.OK);
		else
			return new ResponseEntity<>("Not Found",HttpStatus.OK);
		
		// WE CAN ALSO WRITE THIS WAY - Change ResponseEntity<Object> to ResponseEntity<String> 
//		Employee employee = empService.getEmployeeById(emp.getId());
//		if(employee==null)
//			return new ResponseEntity<String>(HttpStatus.OK);
//		empService.updateEmployee(emp,emp.getId());
//		return new ResponseEntity<String>(HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<Object> deleteEmployee(@PathVariable("id") int id){
		Employee emp = empService.getEmployeeById(id);
		if(emp == null)
			return new ResponseEntity<>("Employee Not Found",HttpStatus.OK);
		else {
			empService.deleteEmployee(id);
			return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
		}
	}
	
	@GetMapping("/employeesByName/{name}")
	public ResponseEntity<Object> employeeListByName(@PathVariable("name") String name){
		return new ResponseEntity<>(empService.findByName(name),HttpStatus.OK);
	}
	
	@GetMapping("/findByNameIs/{name}")
	public ResponseEntity<Object> findByNameIs(@PathVariable("name") String name){
		return new ResponseEntity<>(empService.findByNameIs(name),HttpStatus.OK);
	}
	
	@GetMapping("/findByNameEquals/{name}")
	public ResponseEntity<Object> findByNameEquals(@PathVariable("name") String name){
		return new ResponseEntity<>(empService.findByNameEquals(name),HttpStatus.OK);
	}
	
	@GetMapping("/findByNameIsNull")
	public ResponseEntity<Object> findByNameIsNull(){
		return new ResponseEntity<>(empService.findByNameIsNull(),HttpStatus.OK);
	}
	
	@GetMapping("/findByNameIsNotNull")
	public ResponseEntity<Object> findByNameIsNotNull(){
		return new ResponseEntity<>(empService.findByNameIsNotNull(),HttpStatus.OK);
	}
	
	@GetMapping("/findByNameNot/{name}")
	public ResponseEntity<Object> findByNameNot(@PathVariable("name") String name){
		return new ResponseEntity<>(empService.findByNameNot(name),HttpStatus.OK);
	}

	@GetMapping("/findByNameIsNot/{name}")
	public ResponseEntity<Object> findByNameIsNot(@PathVariable("name") String name){
		return new ResponseEntity<>(empService.findByNameIsNot(name),HttpStatus.OK);
	}
	
	@GetMapping("/findByNameStartingWith")
	public ResponseEntity<Object> findByNameStartingWith(){
		String name = "D";
		return new ResponseEntity<>(empService.findByNameStartingWith(name),HttpStatus.OK);
	}
	
	@GetMapping("/findByNameEndingWith")
	public ResponseEntity<Object> findByNameEndingWith(){
		String name = "Y";
		return new ResponseEntity<>(empService.findByNameEndingWith(name),HttpStatus.OK);
	}
	
	@GetMapping("/findByNameContaining")
	public ResponseEntity<Object> findByNameContaining(){
		String name = "pa";
		return new ResponseEntity<>(empService.findByNameContaining(name),HttpStatus.OK);
	}
	
	@GetMapping("/findByNameLike")
	public ResponseEntity<Object> findByNameLike(){
		String name = "t%n%a";
		return new ResponseEntity<>(empService.findByNameLike(name),HttpStatus.OK);
	}
	
	@GetMapping("/findBySalaryLessThan")
	public ResponseEntity<Object> findBySalaryLessThan(){
		return new ResponseEntity<>(empService.findBySalaryLessThan(10000),HttpStatus.OK);
	}
	
	@GetMapping("/findBySalaryLessThanEqual")
	public ResponseEntity<Object> findBySalaryLessThanEqual(){
		return new ResponseEntity<>(empService.findBySalaryLessThanEqual(1000000),HttpStatus.OK);
	}
	
	@GetMapping("/findBySalaryGreaterThan")
	public ResponseEntity<Object> findBySalaryGreaterThan(){
		return new ResponseEntity<>(empService.findBySalaryGreaterThan(1000),HttpStatus.OK);
	}
	
	@GetMapping("/findBySalaryGreaterThanEqual")
	public ResponseEntity<Object> findBySalaryGreaterThanEqual(){
		return new ResponseEntity<>(empService.findBySalaryGreaterThanEqual(3000),HttpStatus.OK);
	}
	
	@GetMapping("/findBySalaryBetween")
	public ResponseEntity<Object> findBySalaryBetween(){
		return new ResponseEntity<>(empService.findBySalaryBetween(1000,5000),HttpStatus.OK);
	}
	
	@GetMapping("/sortByName")
	public ResponseEntity<Object> findByNameOrderByName(){
		return new ResponseEntity<>(empService.findAllByOrderByName(),HttpStatus.OK);
	}
	
	@GetMapping("/sortByNameDesc")
	public ResponseEntity<Object> findAllByOrderByNameDesc(){
		return new ResponseEntity<>(empService.findAllByOrderByNameDesc(),HttpStatus.OK);
	}
	
	@GetMapping("/sortBySalary")
	public ResponseEntity<Object> findAllByOrderBySalary(){
		return new ResponseEntity<>(empService.findAllByOrderBySalary(),HttpStatus.OK);
	}
	
	@GetMapping("/sortBySalaryDesc")
	public ResponseEntity<Object> findAllByOrderBySalaryDesc(){
		return new ResponseEntity<>(empService.findAllByOrderBySalaryDesc(),HttpStatus.OK);
	}
}
