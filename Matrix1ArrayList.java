package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix1ArrayList {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("number of rows");
		int row = read.nextInt();
		System.out.println("number of columns");
		int col = read.nextInt();
		ArrayList<ArrayList<Integer>> m1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> m2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> sum = new ArrayList<ArrayList<Integer>>();
		System.out.println("enter elements of matrix 1");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (m1.size() < i + 1) {
					m1.add(i, new ArrayList<>());
				}
				m1.get(i).add(j, read.nextInt());
			}
		}
		System.out.println("enter elements of matrix 2");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (m2.size() < i + 1) {
					m2.add(i, new ArrayList<>());
				}
				m2.get(i).add(j, read.nextInt());
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (sum.size() < i + 1) {
					sum.add(i, new ArrayList<>());
				}
				sum.get(i).add(j, m1.get(i).get(j) + m2.get(i).get(j));
			}
		}
		System.out.println("sum matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(sum.get(i).get(j) + "    ");
			}
			System.out.println();
		}

	}

}
