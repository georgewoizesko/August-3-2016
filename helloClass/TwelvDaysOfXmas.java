package com.helloClass;

public class TwelvDaysOfXmas {

	public static void main(String[] args) {
		

		
		for (int i = 1; i < 13; i++) {
			
			System.out.print("On the " + i);
			
			switch (i){
			case 1:
				System.out.print("st");
				break;
			case 2:
				System.out.print("nd");
				break;
			case 3:
				System.out.print("rd");
				break;
			default:
				System.out.print("th");
			}
			
			System.out.println(" day of Xmas my true love gave to me\n");
			
			switch (i) {
			default:
				System.out.println("\tDrummers Drumming");
				break;
			case 11:
				System.out.println("\tPipers Piping");
				break;
			case 10:
				System.out.println("\tLords-a-leaping");
				break;
			case 9:
				System.out.println("\tLadies Dancing");
				break;
			case 8:
				System.out.println("\tMaids a Milking");
				break;
			case 7:
				System.out.println("\tSwans are Swimming");
				break;
			case 6:
				System.out.println("\tGeese-a-Laying");
				break;
			case 5:
				System.out.println("\tGold Rings");
				break;
			case 4:
				System.out.println("\tCalling Birds");
				break;
			case 3:
				System.out.println("\tThree French Hens");
				break;
			case 2:
				System.out.println("\tTwo Turtle Doves");
				break;
			case 1:
				System.out.println("\tPartridge in a Pear Tree");
				break;
			}
			
			
		}
	}

}
