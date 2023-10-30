public class RockPaperScissors {
    public String playerChoice;
    public String computerChoice = computerChoice();
    public RockPaperScissors(String playerChoice) {
        this.playerChoice = playerChoice;
    }
    public String computerChoice(){
        int numChoice = (int) (Math.random() * 3) + 1;
        if (numChoice == 1) {
            return "rock";
        }
        if (numChoice == 2) {
            return "paper";
        }
        if (numChoice == 3) {
            return "scissors";
        }
        return null;
    }
    public String getComputerChoice() {
        return computerChoice;
    }
    public String didWin() {
        if (playerChoice.equals(computerChoice)) {
            return "Tie!";
        }else {
            if (playerChoice.equals("rock")) {
                if (computerChoice.equals("paper")) {
                    return "You lost!";
                }
                if (computerChoice.equals("scissors")) {
                    return "You won!";
                }
            }
            if (playerChoice.equals("scissors")) {
                if (computerChoice.equals("rock")) {
                    return "You lost!";
                }
                if (computerChoice.equals("paper")) {
                    return "You won!";
                }
            }
            if (playerChoice.equals("paper")) {
                if (computerChoice.equals("rock")) {
                    return "You won!";
                }
                if (computerChoice.equals("scissors")) {
                    return "You lost!";
                }
            }
        }

        return null;
    }
}
