package com.tanmay.java.MLEU.Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Tanmay", 22, new Address("1235"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student s2 = new Student("jayesh", 23, new Address("385002"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("2222")));

		Student s3 = new Student("Tanya", 24, new Address("5612"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("8975")));

		List<Student> l = new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);

		// student with matching name "Jayesh"
		for (Student s : l) {
			if (s.getName().equals("jayesh"))
				System.out.println("Student Matching Name \"Jayesh\" : " + s.getName() + "; Age: " + s.getAge());
		}

		// student with matching address "1235"
		for (Student s : l) {
			if (s.getAddress().getZipcode().equals("1235"))
				System.out.println("Student Matching Address \"12345\" : " + s.getName() + "; Age: " + s.getAge());
		}

		// Get all student having mobile numbers 3333.
		List<String> list = new ArrayList<>();
		for (Student s : l) {
			for (MobileNumber str : s.getMobileNumbers()) {
				if (str.getNumber().equals("3333"))
					list.add(s.getName());
			}
		}
		System.out.println("Students having Mobile Numbers \"3333\" : " + list);

		// Get all student having mobile number 1233 and 1234
		Set<String> list1 = new HashSet<String>();
		for (Student s : l) {
			for (MobileNumber str : s.getMobileNumbers()) {
				if (str.getNumber().equals("1233") || str.getNumber().equals("1234"))
					list1.add(s.getName());
			}
		}
		System.out.println("Students having Mobile Numbers \"1233 and 1234\" : " + list1);

		// Create a List<Student> from the List<TempStudent>
		TempStudent ts1 = new TempStudent("yash", 22, new Address("1235"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		TempStudent ts2 = new TempStudent("Raj", 23, new Address("385002"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("2222")));

		List<TempStudent> tempStudentList = Arrays.asList(ts1, ts2);

		List<Student> studentList = tempStudentList.stream().map(tempStudent -> new Student(tempStudent.name,
				tempStudent.age, tempStudent.address, tempStudent.mobileNumbers)).collect(Collectors.toList());

		System.out.println("Student as List from TempStudent" + studentList);

		// Convert List<Student> to List<String> of student name

		List<String> studNames = new ArrayList<>();
		for (Student s : l) {
			studNames.add(s.getName());
		}

//		List<String> studentsName = studentList.stream()
//	            .map(Student::getName)
//	            .collect(Collectors.toList());

		System.out.println("List of Student Names: " + studNames);

		// Convert List<students> to String

		String name = studentList.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println("List<students> to String : " + name);

		// Change the case of List<String>

		List<String> ls = Arrays.asList("Tanmay", "Modh", "Hello", "sir");
		System.out.println("Change the Case Of List<String> : ");
		for (String s : ls) {
			System.out.println(s.toUpperCase());
		}
		
		// Sort List<String>
		System.out.println("List Before Sort : "+ls);
		Collections.sort(ls);
		// using Streams
		// ls.stream().sorted().forEach(System.out::println);
		System.out.println("List After Sort : "+ls);
		
		// Conditionally apply Filter condition, say if flag is enabled then.

		boolean ConditionFlag = true;
		
		Stream<Student> result = l.stream().filter(stu->stu.getName().startsWith("T"));
		
		if(ConditionFlag)
			result = result.sorted(Comparator.comparing(Student::getName));
		
		System.out.println("Before Sorting: ");
		l.forEach(s -> System.out.println(s.getName()));
		
		List<Student> comparedList = result.collect(Collectors.toList());
		System.out.println("After filter and Conditional Sorting : ");
		comparedList.forEach(s -> System.out.println(s.getName()));
		
	}
}
