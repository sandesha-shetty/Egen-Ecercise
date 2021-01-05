package rpsgame;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        char quit = ' ';
        while(quit!='q'){
            game.play();
            System.out.println("Play Again, Press Any ket to continue or q to quit");
            quit = scanner.nextLine().toLowerCase().charAt(0);
        }
        scanner.close();
        game.displayStaistics();
    }
}
