package rpsgame;

public class Game extends GameItems {
    private Player player;
    private Computer computer;

    private CHOICES pChoice;
    private CHOICES cChoice;

    private RESULTS results;

    private static int wins;
    private static int loses;
    private static int ties;


    public Game(){
        super();
        player = new Player();
        computer = new Computer();
    }

    public void play(){
        pChoice = player.getChoice();
        cChoice = computer.getChoice();
        results = getResults();
        displayResults();
        statistics();
    }

    public RESULTS getResults(){
        if(pChoice == cChoice)
            return RESULTS.Tie;

        switch (pChoice){
            case R:
                return (cChoice == CHOICES.S ? RESULTS.Win: RESULTS.Lose);
            case P:
                return (cChoice == CHOICES.R ? RESULTS.Win: RESULTS.Lose);
            case S:
                return (cChoice == CHOICES.P ? RESULTS.Win: RESULTS.Lose);
        }
        return RESULTS.Lose;
    }

    private void displayResults(){
        switch(results){
            case Win :
                System.out.println(pChoice + "\tbeats\t" + cChoice + "\tPlayer Wins");
                break;
            case Lose:
                System.out.println(pChoice + "\tlose\t" + cChoice + "\tPlayer Lose");
                break;
            case Tie:
                System.out.println(pChoice + "\tequals\t" + cChoice + "\tPlayer Ties\t");
                break;

        }
    }

    private void statistics(){
        if(results == RESULTS.Win)
            wins++;
        else if(results == RESULTS.Lose)
            loses++;
        else
            ties++;
    }

    public void displayStaistics(){
        System.out.println("Played:" + wins + loses + ties + "Games" );
        System.out.println("Won" + wins);
        System.out.println("Loses" + loses);
        System.out.println("Ties" + ties);
        System.out.println("Good Game!!");
    }
}
