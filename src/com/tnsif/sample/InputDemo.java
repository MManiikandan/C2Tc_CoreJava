package com.tnsif.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;

public class InputDemo {
	public static void main(String[] args) throws IOException {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	Console console=System.console();
	System.out.print("Enter the name: ");
	String name=input.readLine();
	System.out.print("Enter the your age: ");
	int age=Integer.parseInt(input.readLine());
	System.out.print(name+" "+age);
	}
}
