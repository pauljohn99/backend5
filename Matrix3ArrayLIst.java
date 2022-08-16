package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix3ArrayLIst {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("number of rows in 1st matrix");
		int row1 = read.nextInt();
		System.out.println("number of columns in 1st matrix");
		int col1 = read.nextInt();
		System.out.println("number of rows in 2nd matrix");
		int row2 = read.nextInt();
		System.out.println("number of columns in 2nd matrix");
		int col2 = read.nextInt();
		ArrayList<ArrayList<Integer>> m1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> m2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> pro = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> multi = new ArrayList<ArrayList<Integer>>();
		if (col1 == row2) {
			System.out.println("enter elements of matrix 1");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					if (m1.size() < i + 1) {
						m1.add(i, new ArrayList<>());
					}
					m1.get(i).add(j, read.nextInt());
				}
			}
			System.out.println("enter elements of matrix 2");
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < col2; j++) {
					if (m2.size() < i + 1) {
						m2.add(i, new ArrayList<>());
					}
					m2.get(i).add(j, read.nextInt());
				}
			}
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					if (multi.size() < i + 1) {
						multi.add(i, new ArrayList<>());
					}
					multi.get(i).add(j, 0);
					int temp=0;
					for (int k = 0; k < col1; k++) {
						temp=temp +( m1.get(i).get(k) * m2.get(k).get(j));
						multi.get(i).add(j,temp);
					}
					System.out.print(multi.get(i).get(j) + "    ");
				}
				System.out.println();
			}
		}
	}
}
