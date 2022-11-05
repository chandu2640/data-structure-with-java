package backtracking;

public class MazeInMultiDirection {
    public static void main(String[] args) {
        boolean[][] board={
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        mazeMultiDirection("",0,0, board);
//        mazeMultiDirection("",0,0,3,3);
    }

    private static void mazeMultiDirection(String ans, int row, int col, boolean[][] board) {
        if(row==board.length-1 && col==board[0].length-1){
            System.out.println(ans);
            return;
        }
        if(!board[row][col]){
            return;
        }
        board[row][col]=false;

        if(row<board.length-1){
            mazeMultiDirection(ans+'D',row+1,col,board);
        }
        if(col<board[0].length-1){
            mazeMultiDirection(ans+'R',row,col+1,board);
        }
        if(row>0){
            mazeMultiDirection(ans+'U',row-1,col,board);
        }
        if(col>0){
            mazeMultiDirection(ans+'L',row,col-1,board);
        }
        board[row][col]=true;
    }
}
