package com.helloClass;

public class diceRoll {

	public static void main(String[] args) {
		
		int numberOfDice = 10;
		
		int sidesOnADie = 6;
		
		
		
		for (int i = 0; i < numberOfDice; i++) {
			
		int diceRoll = (int)((Math.random() * sidesOnADie) + 1);
			
		
		System.out.println(diceRoll);
		}
	}

}
