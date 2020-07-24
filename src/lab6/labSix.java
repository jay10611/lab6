package lab6;
import java.util.Random;
import java.util.Scanner;
public class labSix {


    public static void main(String []args) {
    	Boolean play = true;
    	while (play) {
    	
    	Random diceOne = new Random();
        Random diceTwo = new Random();
        Scanner input = new Scanner(System.in);
        int faces;
        int resultsOne=1;
        int resultsTwo=1;

        System.out.println("How many faces does the dice have?");
        faces = input.nextInt();
        resultsOne = diceOne.nextInt(faces) + 1;
        resultsTwo = diceTwo.nextInt(faces) + 1;
        System.out.println("The dice rolled a " + resultsOne +" , "+ resultsTwo  );
      if (resultsOne == resultsTwo && resultsOne == 1) {
    	  System.out.println("snake eyes");
      		}
    	  else if (resultsOne + resultsTwo == 7) {
        	  System.out.println("CRAPS!!! BIG WINNER!!!");
    	  	}
    	  else if (resultsOne == resultsTwo && resultsOne == 6) {
        	  System.out.println("box car");    	  	
    	    }
      	System.out.println("Would you like to play again Y/N?");
      	play = input.next().equalsIgnoreCase("y");
    	}
    }
}