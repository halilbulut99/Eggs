package eggs;

import java.util.Scanner;

public class Vessel {
	Vessel theEggs[ ] = new Vessel[20];  
	
	Scanner input = new Scanner(System.in);
	
	public void addEgg(Vessel e){
		
		System.out.println("How much eggs you want to boil? ");
		
	   int eggQ=input.nextInt();
	    
			if (eggQ==1) {
				System.out.println("You must get Jesse");
			} else if(eggQ>=2  && eggQ<=5) {
				System.out.println("You must get Cane");
			}else if(eggQ>=6 && eggQ<=20){
				System.out.println("You must get Saucepan");
			}else{
			System.out.println("No Space to Add More Eggs.");
			}
		}
	
	    }

	