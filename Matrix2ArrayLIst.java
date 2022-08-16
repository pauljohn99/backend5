package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix2ArrayLIst {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("number of rows");
		int row = read.nextInt();
		System.out.println("number of columns");
		int col = read.nextInt();
		System.out.println("enter constant");
		int con = read.nextInt();
		ArrayList<ArrayList<Integer>> m1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> pro = new ArrayList<ArrayList<Integer>>();
		System.out.println("enter elements of matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (m1.size() < i + 1) {
					m1.add(i, new ArrayList<>());
				}
				m1.get(i).add(j, read.nextInt());
			}
		}
			for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (pro.size() < i + 1) {
					pro.add(i, new ArrayList<>());
				}
				pro.get(i).add(j, m1.get(i).get(j) * con);
			}
		}
		System.out.println("product matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(pro.get(i).get(j) + "    ");
			}
			System.out.println();
		}

	}

}
