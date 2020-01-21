package eggs;

import java.util.Scanner;

public class Boiling {
Boiling theTime[] = new Boiling[10];  
	
	Scanner input = new Scanner(System.in);
	
	public void boilTime(Boiling b){
		System.out.println("How much time you want to boil? \n ");
	   int boilTime=input.nextInt();
	    
			if (boilTime>=1 && boilTime<=3) {
				System.out.println("Eggs will getting wet.");
			}else if(boilTime>=4 && boilTime<=5){
				System.out.println("The yolk remains liquid, the protein hardens. ");
			}else if(boilTime>6){
				System.out.println("Protein and yolk become solid. ");
			}else{
			System.out.println("No!incorrect!");
			}
		}
	
	    }

