package com.orthofx;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArraySorting {
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		 ArrayList<String> name = new ArrayList<String>();
		System.out.println("enter names");
		for(int i=0;i<10;i++) {
			String in=read.next();
			name.add(in);
		}
		Collections.sort(name);
		System.out.println(name);
			
		}
		}

