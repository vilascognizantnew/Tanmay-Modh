package com.tanmay.java.MLEU.Assignment1;

import java.util.Scanner;

public class Student {
    
	// declaring variables
    private int id;
    private String name;
    private float marks[];
    private char grade;
    private int per;
    
    // initializing variables
    public void init()
    {
        this.id=0;
        this.name="Unknown";
        this.grade = ' ';
        this.marks=null;
    }
    
    // grade and percentage calculation
    public void init(int id,String name,float marks[])
    {
        this.id=id;
        this.name=name;
        this.marks=marks;
        float avg=0;
        
        // Calculate Percentage
        if(marks!=null) {
            for(int i=0;i<marks.length;i++)
            {
                avg=avg+marks[i];
            }
            avg=avg/marks.length;
            per=(int)avg;
        }
        
        // calculate Grade
        if(per>90) grade='A';
        else if(per>80 && per<=90) grade='B';
        else if(per>70 && per<=80) grade='C';
        else if(per>60 && per<=70) grade='D';
        else grade='F';
    }
    
    // display Student Details
    public void display()
    {
        System.out.println("Id="+id);
        System.out.println("Name="+name);
        System.out.println("Marks=");
        for(float i:marks)
        	System.out.println("["+i+"]");
        System.out.println("Per="+per);
        System.out.println("Grade="+grade);
    }
    
    
    public static void main(String args[]) {
    	Student s = new Student();
    	s.init();
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter id: ");
    	int id = scanner.nextInt();
    	System.out.println("Enter name: ");
    	String name = scanner.next();
    	System.out.println("Marks for 3 subjects");
    	float marks[] = new float[3];
    	for(int i=0;i<marks.length;i++) {
    		marks[i] = scanner.nextFloat();
    	}
    	s.init(id,name,marks);
    	s.display();
    }
}
