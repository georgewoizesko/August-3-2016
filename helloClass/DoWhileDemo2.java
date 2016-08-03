package com.helloClass;

public class DoWhileDemo2 {

	public static void main(String[] args) {
					
			String[][] name = new String[3][5];
			name[0][0] = "George";
			name[0][1] = "Chris";
			name[0][2] = "Stewart";
			name[0][3] = "Vafa";
			name[0][4] = "Ami";
			name[1][0] = "Mike";
			name[1][1] = "Kyle";
			name[1][2] = "John";
			name[1][3] = "Justin";
			name[1][4] = "Jamal";
			name[2][0] = "George";
			name[2][1] = "Chris";
			name[2][2] = "Stewart";
			name[2][3] = "Vafa";
			name[2][4] = "Ami";
			name[3][0] = "Mike";
			name[3][1] = "Kyle";
			name[3][2] = "John";
			name[3][3] = "Justin";
			name[3][4] = "Jamal";
			
			//Print 2D Array
			int count = 0;
			int count2 = 0;
			do {
				do {
					System.out.println(name[count2][count]);
					count++;
				} while (count < 5);
			count2++;
			}while (count2 < 3);
			
		
	}
		
	


	}

}
