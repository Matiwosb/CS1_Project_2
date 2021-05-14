import java.util.Random;
public class DiceGame {
    public static void main(String[] args){
        Random random = new Random();
        int numberOfTurns = 10;
        int computerPlayer;
        int userPlayer;
        int computerPlayerScore = 0;
        int userPlayerScore = 0;
        for(int i = 1;i <= numberOfTurns; i++){
            computerPlayer = random.nextInt(6)+1;
            userPlayer = random.nextInt(6)+1;
            if(computerPlayer > userPlayer){
                computerPlayerScore += 1;
                System.out.println("Computer win " + i + " turn");
            }else if (userPlayer > computerPlayer){
                userPlayerScore += 1;
                System.out.println("User win " + i + " turn");
            }else{
                System.out.println("Turn " + i + " was a tie");
            }
        }
        System.out.println();
        if(computerPlayerScore > userPlayerScore){
            System.out.println("The Computer was the grand winner, winning " + computerPlayerScore + " out of " + numberOfTurns);
        }else if (userPlayerScore > computerPlayerScore){
            System.out.println("The User was the grand winner, winning " + computerPlayerScore + " out of " + numberOfTurns);
        }else if(computerPlayerScore == userPlayerScore){
            System.out.println("It is a tie the computer winning by " + computerPlayerScore + " turns and the user " +
                    "winning " + userPlayerScore + " turns");
        }
    }
}
