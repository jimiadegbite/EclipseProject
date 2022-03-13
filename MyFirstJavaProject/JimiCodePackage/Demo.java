package JimiCodePackage;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        
        // Displaying the number 
        System.out.println("The number entered by user: "+num);
	}

}
