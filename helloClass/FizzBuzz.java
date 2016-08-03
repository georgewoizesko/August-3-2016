package com.helloClass;

public class FizzBuzz {

	public static void main(String[] args) {
		
		//FizzBuzzBang
		//test if 3 is cleanly divisable - replace with fizz
		//test if 3 is cleanly divisable - replace with buzz
		//test if 3 is cleanly divisable - replace with bang
		
		for (int i = 1; i <= 110; i ++){
			if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)){
				
				System.out.println(" - Fizz Buzz Bang");
				
			} else if (((i % 3) == 0) && ((i % 5) == 0)){
				
				System.out.println(" - Fizz Buzz");
				
			} else if (((i % 5) == 0) && ((i % 7) == 0)){
				
				System.out.println(" - Buzz Bang");
				
			} else if (((i % 3) == 0) && ((i % 7) == 0)){
				
				System.out.println(" - Fizz Bang");
				
			} else if ((i % 7 == 0)) {
				
				System.out.println(" - Bang");
				
			} else if ((i % 5 == 0)) {
				
				System.out.println(" - Buzz");
				
			} else if ((i % 3 == 0)) {
				
				System.out.println(" - Fizz");
				
			}else{
			
			System.out.println(i);
			}
		
		}
		
	}
	}
