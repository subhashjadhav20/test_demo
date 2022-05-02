package com.test;

import java.util.Scanner;

public class Main {
public static void main(String[]args) {
	AgeLimit agelimit=new AgeLimit();
	System.out.println("Enter the Age");
	Scanner sc=new Scanner(System.in);
	     int  Age=sc.nextInt();
	     try {
	    	 agelimit.AgelimitCheck(Age);
	     }catch (Exception e) {
	    	System.out.println(e);
	     }
}
}
