package backtracking;

import java.util.ArrayList;

public class StartMaze {
    public static void main(String[] args) {
        startToEndMaze("",3,3);
//        ArrayList<String> ans=new ArrayList<>();
//        ans=startToEndMazeReturn("",6,6);
//        System.out.println(ans);
    }

//    private static void startToEndMaze(String ans, int row, int col) {
//        if(row==1 && col==1){
//            System.out.println(ans);
//            return;
//        }
//        if (row == 1) {
//            startToEndMaze(ans+'R',row,col-1);
//            return;
//        }
//        else if(col==1){
//            startToEndMaze(ans+'D',row-1,col);
//            return;
//        }
//
//        startToEndMaze(ans+'D',row-1,col);
//        startToEndMaze(ans+'R',row,col-1);
//    }

    //Another Method but same logic
    private static void startToEndMaze(String ans, int row, int col) {
        if(row==1 && col==1){
            System.out.println(ans);
            return;
        }

        if (row > 1) {
            startToEndMaze(ans+'D',row-1,col);
        }
        if(col>1){
            startToEndMaze(ans+'R',row,col-1);
        }
    }

    private static ArrayList<String> startToEndMazeReturn(String ans, int row, int col) {
        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
//            System.out.println(ans);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if (row > 1) {
             list.addAll(startToEndMazeReturn(ans+'D',row-1,col));
        }
        if(col>1){
             list.addAll(startToEndMazeReturn(ans+'R',row,col-1));
        }
        return list;
    }
}
