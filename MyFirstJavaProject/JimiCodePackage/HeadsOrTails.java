package JimiCodePackage;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class HeadsOrTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int correctCount = 0;
		int coin_flip = 0;
		DecimalFormat df = new DecimalFormat("0.0");
		
		
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Head for 1 and Tail for 0");
 
        String headsOfTailsGuess = in.nextLine();
        if (headsOfTailsGuess.equals("Head")) {
        	num = 1;
        }
        if (headsOfTailsGuess.equals("Tail")) {
        	num = 0;
        }
               
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of times you want the computer to generate a coin flip: ");
        int numberOfFlips = scan.nextInt();
        
        Random random = new Random();
     
        for (int i = 0; i < numberOfFlips; i++){
        	
            coin_flip = random.nextInt(2);
        	if (coin_flip == num) {
        		correctCount++;		
        	}
        
        }
    	System.out.println(correctCount);
        double pct = (correctCount*100)/numberOfFlips;
        System.out.println(df.format(pct));
        
        
	}

}
