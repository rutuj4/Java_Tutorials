package com.company;

public class D12_PracticeSet2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pgm to encrypt a grade by 8 to it. Decrypt it to show the correct grade.");
		char grade = 'B';
		grade = (char)(grade + 8);
		System.out.println(grade);
		
		//Decrypting the grade
		grade = (char)(grade - 8);
		System.out.println(grade);
	}

}
