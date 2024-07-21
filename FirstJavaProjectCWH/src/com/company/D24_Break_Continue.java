package com.company;

public class D24_Break_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Break Statements		
		
//		for(int i = 0;i<5;i++) {
//			System.out.println(i);
//			System.out.println("java is great");
//			if(i==2) {
//				System.out.println("Ending the loop");
//				break;
//			}
//		}
		
		
//		int i=0;
//		while(i<5) {
//			System.out.println(i);
//			System.out.println("java is great");
//			if(i==2) {
//				System.out.println("Ending the loop");
//				break;
//			}
//			i++;
//		}
		
		
//		int i=0;
//		do{
//			System.out.println(i);
//			System.out.println("java is great");
//			if(i==2) {
//				System.out.println("Ending the loop");
//				break;
//			}
//			i++;
//		}while(i<5);
//		System.out.println("Loop ends here");
		
//Continue Statements
		for(int i = 0;i<5;i++) {
			if(i==2) {
				System.out.println("Ending the loop");
				continue;
			}
			System.out.println(i);
			System.out.println("Java is great");
		}
	}
} 