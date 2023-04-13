package com.bldea.crorepathiApp.package1;

import java.util.Scanner;

public class CrorepathiApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO CROREPATHI");
		System.out.println("LETS WELCOME OUR FIRST CANDIDATE");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What is your city?");
		String city = sc.next();
		System.out.println("What is your state?");
		String state = sc.next();

		candidate c1= new candidate(name, age, city, state);
		
		System.out.println("Congratulations for making it till here Mr/Ms. "+c1.getName());
		
		System.out.println("The rules of the Game");
		System.out.println("1. There will be 10 question which rewards a specific amout in "
				+"incremental order");
		System.out.println("2. The Game will contain 3 lifelines" 
		+"(audiance phone, 50-50 and skip the question");
		System.out.println("3. you can quit the game at any stage.");
		System.out.println("Pleas type 1 if you wish to see the reward per question ");
		int type_1 = sc.nextInt();
		if(type_1==1) {
			System.out.println("Question-1 : 1000 \n"+
								"Question-2 : 5000 \n"+
								"Question-3 : 10000 \n"+
								"Question-4 : 20000 \n"+
								"Question-5 : 150000 \n"+
								"Question-6 : 300000 \n"+
								"Question-7 : 400000 \n"+
								"Question-8 : 1000000 \n"+
								"Question-9 : 5000000 \n"+
								"Question-10 : 10000000 \n");
			System.out.println("So you wish to continue?? (type: YES/NO)");
		}
		else {
			System.out.println("So you wish to continue?? (type: YES/NO)");
		}
			String type_2 = sc.next(); 
			
			if(type_2.equalsIgnoreCase("YES")==true) {
			System.out.println("Lets Begin the Game");	
			System.out.println("here is the first question.");
			boolean res1 = questions.fetchquestions1(c1.getName());
			if(res1==true) {
				System.out.println("Congratulations!! Your Answer is correct.\n"+"You have won Rs."
			+c1.getAmount());
				System.out.println("here is your next question.");
				boolean res2 = questions.fetchquestions2(c1.getName());
				if(res2==true) {
					System.out.println("Congratulations!! Your Answer is correct.\n"+"You have won Rs."
				+c1.getAmount());
					System.out.println("here is your next question.");
					boolean res3 = questions.fetchquestions3(c1.getName());
					if(res3==true) {
						System.out.println("Congratulations!! Your Answer is correct.\n"+"You have won Rs."
					+c1.getAmount());
						System.out.println("here is your next question.");	
						boolean res4 = questions.fetchquestions4(c1.getName());
						if(res4==true) {
							System.out.println("Congratulations!! Your Answer is correct.\n"+"You have won Rs."
						+c1.getAmount());
							System.out.println("here is your next question.");
							boolean res5 = questions.fetchquestions5(c1.getName());
							if(res5==true) {
								System.out.println("Congratulations!! Your Answer is correct.\n"+"You have won Rs."
							+c1.getAmount());
								System.out.println("here is your next question.");
								boolean res6 = questions.fetchquestions6(c1.getName());
								if(res6==true) {
									System.out.println("Congratulations!! Your Answer is correct.\n"+"You have won Rs."
								+c1.getAmount());
									System.out.println("here is your next question.");
									boolean res7 = questions.fetchquestions7(c1.getName());
									if(res7==true) {
										System.out.println("Congratulations!! Your Answer is correct.\n"+"You have won Rs."
									+c1.getAmount());
										System.out.println("here is your next question.");
										boolean res8 = questions.fetchquestions8(c1.getName());
										if(res8==true) {
											System.out.println("Congratulations!! Your Answer is correct.\n"+"You have won Rs."
										+c1.getAmount());
											System.out.println("here is your next question.");
											boolean res9 = questions.fetchquestions9(c1.getName());
											if(res2==true) {
												System.out.println("Congratulations!! Your Answer is correct.\n"+"You have won Rs."
											+c1.getAmount());
												System.out.println("here is your next question.");
												boolean res10 = questions.fetchquestions10(c1.getName());
												if(res10==true) {
													System.out.println("Congratulations!! Your Answer is correct.\n"+"You have won Rs."
												+c1.getAmount());
													System.out.println("Congratulation!! You Are the Winner ");
			}
				
				
				else {
					System.out.println("We are sorry!! Your Answer is incorrect.\n"+"You have Rs."
				+c1.getAmount());
				}
			}
											else {
												System.out.println("We are sorry!! Your Answer is incorrect.\n"+"You have Rs."
											+c1.getAmount());
											}
										}
											else {
												System.out.println("We are sorry!! Your Answer is incorrect.\n"+"You have Rs."
											+c1.getAmount());
											}
										}
										else {
											System.out.println("We are sorry!! Your Answer is incorrect.\n"+"You have Rs."
										+c1.getAmount());
										}
									}
									else {
										System.out.println("We are sorry!! Your Answer is incorrect.\n"+"You have Rs."
									+c1.getAmount());
									}
								}
								else {
									System.out.println("We are sorry!! Your Answer is incorrect.\n"+"You have Rs."
								+c1.getAmount());
								}
							}
							else {
								System.out.println("We are sorry!! Your Answer is incorrect.\n"+"You have Rs."
							+c1.getAmount());
							}
						}
						else {
							System.out.println("We are sorry!! Your Answer is incorrect.\n"+"You have Rs."
						+c1.getAmount());
						}
					}
					else {
						System.out.println("We are sorry!! Your Answer is incorrect.\n"+"You have Rs."
					+c1.getAmount());
					}
				}
											
			else {
				System.out.println("We are sorry!! Your Answer is incorrect.\n"+"You have Rs."
				+c1.getAmount());
			}
			}
			else {
				System.out.println("Thank you for coming. All the best!!");
			}
		}
}
		
								


