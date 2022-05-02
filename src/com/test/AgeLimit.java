package com.test;

public class AgeLimit {

	public void AgelimitCheck(int Age) {
		if (Age>18) {
			throw new AgeException ("Welcome to Vote");
		}
		else {
		System.out.println("The age must be above The 18");
		}
	}
}
