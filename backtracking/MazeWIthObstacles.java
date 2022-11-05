package backtracking;

public class MazeWIthObstacles {
    public static void main(String[] args) {
        boolean[][] board={
                {true, true, true},
                {true, true, false},
                {true, true, true}
        };

        startToEndMazeBoo("",0,0, board);
//        startToEndMaze("",0,0, 1,1);
    }

    private static void startToEndMazeBoo(String ans, int row, int col, boolean[][] board) {
        if(row == board.length-1 && col == board[0].length-1){
            System.out.println(ans);
            return;
        }

        if(!board[row][col]){
            return;
        }
        if(row<board.length-1){
            startToEndMazeBoo(ans+"D",row+1,col, board);
        }
        if(col<board[0].length-1){
            if(!board[row][col]){
                return;
            }
            startToEndMazeBoo(ans+"R",row,col+1, board);
        }
    }

    private static void startToEndMaze(String ans, int row, int col,int a, int b) {
        if(row==2 && col==2) {
            System.out.println(ans);
            return;
        }

        if(row<3){
            startToEndMaze(ans+"D",row+1,col,a,b);
        }
        if(col<3){
            startToEndMaze(ans+"R",row,col+1,a,b);
        }
    }
}
