package com.orthofx;

import java.util.Scanner;
import java.util.HashMap;
public class HashMapp {
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		HashMap<String, Integer> students = new HashMap<String, Integer>();
		System.out.println("enter 1 for entering records 2 for viewing records");
		int c=read.nextInt();
		switch (c) {
		case 1:
			System.out.println("enter number of students");
			int n=read.nextInt();
			for(int i=0;i<n;i++) {
				String names=read.next();
				int mark=read.nextInt();
				students.put(names, mark);
			}
		case 2:
			System.out.println("enter name of student");
			String name=read.next();
			System.out.println(students.get(name));
			
		}
		

	}}
