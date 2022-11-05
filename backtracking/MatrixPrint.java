package backtracking;

import java.util.Arrays;

public class MatrixPrint {
    public static void main(String[] args) {
        boolean[][] board={
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path=new int[board.length][board[0].length];

        matrixPathPrint("",0,0,board,path,1);
    }

    private static void matrixPathPrint(String ans, int row, int col, boolean[][] board,int[][] path, int step) {
        if(row==board.length-1 && col==board[0].length-1){
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            System.out.println(ans);
            return;
        }
        if(!board[row][col]) return;
        board[row][col]=false;
        path[row][col]=step;
        if(row<board.length-1){
            matrixPathPrint(ans+'D',row+1,col,board,path,step+1);
        }
        if(col<board[0].length-1){
            matrixPathPrint(ans+'R',row,col+1,board,path,step+1);
        }
        if(row>0){
            matrixPathPrint(ans+'U',row-1,col,board,path,step+1);
        }
        if(col>0){
            matrixPathPrint(ans+'L',row,col-1,board,path,step+1);
        }
        board[row][col]=true;
        path[row][col]=0;
    }
}
