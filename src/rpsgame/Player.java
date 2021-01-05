package rpsgame;

import java.util.Scanner;

public class Player extends GameItems {
    Scanner scanner;
    public Player(){
        super();
        scanner = new Scanner(System.in);
    }

    public CHOICES getChoice(){
        System.out.println("Please Enter your choice: R: Rock, P:Paper, S: Scissor");
        char playerChoice = scanner.nextLine().toLowerCase().charAt(0);
        switch(playerChoice){
            case 'r':
                return CHOICES.R;
            case 'p':
                return CHOICES.P;
            case 's':
                return CHOICES.S;
        }
        //Invalid Input
        System.out.println("Invalid Input");
        return getChoice();
    }
}
