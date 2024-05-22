package com.mmanikandan.assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScore {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> scoreList=new ArrayList<Integer>();
		System.out.println("Enter the number of students: ");
		int noOfStudents=sc.nextInt();
		System.out.println("Enter the score of the students: ");
		for(int i=0;i<noOfStudents;i++) {
			scoreList.add(sc.nextInt());
		}
		System.out.println(scoreList);
	}

}
