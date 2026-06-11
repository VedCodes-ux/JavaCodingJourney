package JavaCodingJourney;

import java.util.Scanner;
import java.util.Random;

public class rockpaperscissor {
    public static void main(String[] args) {
        String[] choices = {"rock","paper","scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playerchoice;
        String computerchoice;
        String playagain = "";
        do {
            System.out.print("enter your choice(rock,paper,scissors):");

        playerchoice = scanner.nextLine().toLowerCase();

        if(!playerchoice.equals("rock")&& !playerchoice.equals("paper") && !playerchoice.equals("scissors")){
            System.out.println("invalid choice");
            continue;
        }

        System.out.print("computer choice choice(rock,paper,scissors):");
        computerchoice = choices[random.nextInt(3)];
        System.out.println(computerchoice);

        if(computerchoice.equals(playerchoice)) {
            System.out.println("its a tie");
        }

        else if(computerchoice.equals("rock") && playerchoice.equals("paper") || computerchoice.equals("paper") && playerchoice.equals("scissors") || computerchoice.equals("scissors") && playerchoice.equals("scissors") ) {
            System.out.println("you win");
        }
        else{
            System.out.println("you loose");
        }
        
        System.out.println("wanna play again(yes/no)");
        playagain = scanner.nextLine().toLowerCase();
            
        } while (playagain.equals("yes"));

        System.out.println("thanks for playing");

        scanner.close();
    }
}
