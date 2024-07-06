package com.company;
import java.util.Scanner;
import java.util.Random;

public class D20_Exercise2_RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("0 = Stone, 1 = Paper, 2 = Scissor. Now enter what you want to pick: ");
		int a = sc.nextInt(3);
		
		if(a == 0) {
			System.out.println("You have picked Stone");
		}
		else if(a == 1) {
			System.out.println("You have picked Paper");
		}
		else if(a == 2) {
			System.out.println("You have picked Scissor");
		}
		
		Random ran = new Random();
		int b = ran.nextInt(3);
		System.out.println("PC has picked: "+b);

		if (b == 0) {
			System.out.println("PC has picked Stone");
		}
		else if (b == 1) {
			System.out.println("PC has picked Stone");
		}
		else{
			System.out.println("PC has picked Stone");
		}

//		switch(b) {
//		case 0:
//			System.out.println("PC has picked Stone");
//			break;
//		case 1:
//			System.out.println("PC has picked Paper");
//			break;
//		case 2:
//			System.out.println("PC has picked Scissor");
//			break;	
//		}
		
		if (a == 0 && b == 0) {
			System.out.println("The game is draw");
		}
		else if (a == 0 && b == 1) {
			System.out.println("PC is the winner");
		}
		else if (a == 0 && b == 2) {
			System.out.println("You are the winner");
		}
		else if (a == 1 && b == 0) {
			System.out.println("You are the winner");
		}
		else if (a == 1 && b == 1) {
			System.out.println("The game is draw");
		}
		else if (a == 1 && b == 2) {
			System.out.println("PC is the winner");
		}
		else if (a == 2 && b == 0) {
			System.out.println("PC is the winner");
		}
		else if (a == 2 && b == 1) {
			System.out.println("You are the winner");
		}
		else{
			System.out.println("The game is draw");
		}
//		else if (a == 3 && b == 3) {
//			System.out.println("The game is draw");
//		}
	}
}
