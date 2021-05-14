import java.util.Scanner;

public class StatsAnalyzer {

    public static int playerTotalPoints(int[][] scores, int p){
        int value = 0;
        for (int i = 0;i < scores[p].length; i++){
           value += scores[p][i];
        }
        return value;
    }
    public static double playerAveragePPG(int[][] scores, int p){
        double average=(double)playerTotalPoints(scores,p)/scores[p].length;
        return average;
    }
    public static int bestOverallPlayer(int[][] scores){
        int index=0;
        int Max = playerTotalPoints(scores,0);
        for (int i=1; i < scores.length; i++){
            int playerScore=playerTotalPoints(scores,i);
            if (playerScore > Max){
                Max = playerScore;
                index = i;
            }
        }
        return index;
    }
    public static int teamPointsInGame(int[][] scores, int g){
       int gameSum=0;
       for (int i=0;i< scores.length;i++){
           gameSum +=scores[i][g];
       }
       return gameSum;
    }
    public static int teamPointsRangeInGame(int[][] scores, int g){
        int maxValue = scores[0][g];
        int minValue = scores[0][g];
        for (int i = 0; i < scores.length; i++){
                if (scores[i][g] > maxValue){
                    maxValue = scores[i][g];
                }
            if (scores[i][g] < minValue){
                minValue = scores[i][g];
            }
        }
        return maxValue - minValue;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        int[][] games={{20,27,16, 23, 20, 27, 18}, {8, 18, 14, 17, 9, 12, 0}, {34, 19, 25, 22, 19, 25, 31}, {17, 8, 11, 34, 15,
            0,9}, {2, 0, 3, 0, 10, 2, 4}};
        System.out.print("Enter player number to display total point and average: ");
        choice = in.nextInt();
        System.out.println("Total point is " + playerTotalPoints(games, choice));
        System.out.println("Average point is " + playerAveragePPG(games,choice));
        System.out.println("The best player is " + bestOverallPlayer(games));
        System.out.print("Enter game number to display the team pint and range: ");
        choice = in.nextInt();
        System.out.println("The team point is " + teamPointsInGame(games, choice));
        System.out.println("The range is " + teamPointsRangeInGame(games, choice));
    }
}
