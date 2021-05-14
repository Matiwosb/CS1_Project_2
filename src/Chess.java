public class Chess {
    public static int countQueenThreats(String[][] board, char color) {
        int threatCount = 0;
        boolean blackTeam = true;
        boolean queenDead = true;

        if (color == 'w') //determine which team is being checked
        {
            blackTeam = false;
        }
        int row = 0, col = 0;
        if (blackTeam == true) {
            for (int i = 0; i < 8; i++) { //determine if black team's queen is dead
                for (int j = 0; j < 8; j++) {
                    if (board[i][j].equals("bQ")) {
                        row = i;
                        col = j;
                        queenDead = false;
                        i = 8;
                        j = 8;
                    }
                }
            }
        } else {
            for (int i = 0; i < 8; i++) { //determine if white team's queen is dead
                for (int j = 0; j < 8; j++) {
                    if (board[i][j].equals("wQ")) {//*****
                        row = i;
                        col = j;
                        queenDead = false;
                        i = 8;
                        j = 8;
                    }
                }
            } //no piece is threatened from this team's queen
        }
        System.out.println("Queen is at: " + row + " " + col);
        if (queenDead == true) {//if the queen was dead the whole time
            threatCount = -1;
        }
//up
//System.out.println("here");
        for (int i = row - 1; i >= 0; i--) {
//System.out.println(i + " " + board[i][col]);
            if (!board[i][col].equals(" ")) {
                if (blackTeam && board[i][col].charAt(0) == 'w') {
                    threatCount++;
                } else if (!blackTeam && board[i][col].charAt(0) == 'b') {
                    threatCount++;
                }
                break;
            }
        }
        System.out.println("up" + threatCount);
//down
        for (int i = row + 1; i < 8; i++) {
//System.out.println(i + " " + board[i][col]);
            if (!board[i][col].equals(" ")) {
                if (blackTeam && board[i][col].charAt(0) == 'w') {
                    threatCount++;
                } else if (!blackTeam && board[i][col].charAt(0) == 'b') {
                    threatCount++;
                }
                break;
            }
        }
        System.out.println("down" + threatCount);
        //right
        for (int j = col + 1; j < 8; j++) {
//System.out.println(i + " " + board[i][col]);
            if (!board[row][j].equals(" ")) {
                if (blackTeam && board[row][j].charAt(0) == 'w') {
                    threatCount++;
                } else if (!blackTeam && board[row][j].charAt(0) == 'b') {
                    threatCount++;
                }
                break;
            }
        }
        System.out.println("right" + threatCount);
        //left
        for (int j = col - 1; j >= 0; j--) {
//System.out.println(i + " " + board[i][col]);
            if (!board[row][j].equals(" ")) {
                if (blackTeam && board[row][j].charAt(0) == 'w') {
                    threatCount++;
                } else if (!blackTeam && board[row][j].charAt(0) == 'b') {
                    threatCount++;
                }
                break;
            }
        }
        System.out.println("left" + threatCount);
        int i = 1;
        while (row - i >= 0 && col + i < 8) {
            if (!board[row - i][col + i].equals(" ")) {
                if (blackTeam && board[row - i][col + i].charAt(0) == 'w') {
                    threatCount++;
                } else if (!blackTeam && board[row - i][col + i].charAt(0) == 'b') {
                    threatCount++;
                }
                break;
            }
            i++;
        }
        System.out.println("up right" + threatCount);
        i = 1;
        while (row - i >= 0 && col - i >= 0) {
            if (!board[row - i][col - i].equals(" ")) {
                if (blackTeam && board[row - i][col - i].charAt(0) == 'w') {
                    threatCount++;
                } else if (!blackTeam && board[row - i][col - i].charAt(0) == 'b') {
                    threatCount++;
                }
                break;
            }
            i++;
        }
        System.out.println("up left" + threatCount);
        i = 1;
        while(row + i < 8 && col + i<8){
            if (!board[row+i][col+i].equals(" ")) {
                if (blackTeam && board[row+i][col+i].charAt(0) == 'w') {
                    threatCount++;
                } else if (!blackTeam && board[row+i][col+i].charAt(0) == 'b') {
                    threatCount++;
                }
                break;
            }
            i++;
        }
        System.out.println("down right" + threatCount);
        i = 1;
        while(row + i < 8 && col - i>=0){
            if (!board[row+i][col-i].equals(" ")) {
                if (blackTeam && board[row+i][col-i].charAt(0) == 'w') {
                    threatCount++;
                } else if (!blackTeam && board[row+i][col-i].charAt(0) == 'b') {
                    threatCount++;
                }
                break;
            }
            i++;
        }
        System.out.println("down left" + threatCount);
                    return threatCount;
                }

                public static void main (String[]args){
                    String[][] board = {{"bR", "bN", "bB", " ", " ", "bR", "bK", " "},
                            {"bP", "bP", " ", " ", "bP", "bP", "bB", "bP"},
                            {" ", " ", "bP", "bP", " ", "bN", "bP", " "},
                            {" ", " ", " ", " ", " ", " ", " ", " "},
                            {" ", " ", "wP", "wP", " ", " ", " ", " "},
                            {" ", " ", "wN", " ", "bQ", "wN", "wP", " "},
                            {"wP", "wP", " ", " ", "wP", "wP", "wB", "wP"},
                            {"wR", " ", "wB", "wQ", " ", "wR", "wK", " "}};
                    char blackTeam = 'b';
                    char whiteTeam = 'w';

                    System.out.println("Black Team: " + countQueenThreats(board, blackTeam));
                    System.out.println("White Team: " + countQueenThreats(board, whiteTeam));
                }
        }
