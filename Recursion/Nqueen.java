package Recursion;
import java.util.*;
class Nqueen {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i< n ;i++){
            for(int j=0 ; j<n;j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<List<String>>();
        solve(0 , board , ans , n);
        return ans ;
    }
    public boolean isSafe(int row, int col , char[][] board , int n){
       int dupRow = row ;
       int dupCol = col;

       while(row>=0 && col>=0){
        if(board[row][col] == 'Q') return false;
        row--;
        col--;
       }
       col = dupCol;
       row = dupRow ;
        while(col>=0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        col = dupCol;
        row = dupRow ;
        while(col >=0 && row <n){
            if(board[row][col] == 'Q' ) return false ;
            row++;
            col--;  
        }
        return true ;
    }

    void solve(int col , char[][] board , List<List<String>> ans , int n ){
        if(col == n){
            ans.add(construct(board));
            return;
        }
        for(int row =0 ;row<n;row++){
            if(isSafe(row, col , board , n)){
                board[row][col] = 'Q';
                solve(col+1, board , ans , n);
                board[row][col] = '.';
            }
        }
    }

    List<String> construct (char[][] board){
        List<String> res = new ArrayList<>();
        for(int i=0; i< board.length ;i++){
         res.add(new String(board[i]));
        }
        return res ;
    }
}