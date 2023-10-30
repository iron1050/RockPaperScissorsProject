import java.util.Scanner;


public class GameRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors\nROck beats Scissors.  Scissors beats paper.  Paper Beats Rock");
        System.out.println("The computer has chosen.  What's your choice? (rock, paper, or scissors)");
        System.out.print("Your choice: ");
        String inputChoice = s.next();
        RockPaperScissors game = new RockPaperScissors(inputChoice);
        System.out.println("Computer chose: " + game.getComputerChoice());
        System.out.println(game.didWin());
    }
}
