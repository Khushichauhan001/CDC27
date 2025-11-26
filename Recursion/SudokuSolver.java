package Recursion;

public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        int row = 0;
        int col = 0;
        solve(board , row , col);
    }
    private boolean solve(char[][] board , int row , int col){
        if(col == 9){
            row = row+1;
            col =0 ;
        }
        if(row ==  9){
            return true ;
        }

       if(board[row][col] != '.'){
        return solve(board , row , col+1);
       }
       for(char ch='1' ; ch <= '9' ;ch++){
        if(isValid(board,row,col,ch)){
            board[row][col] = ch;
            if(solve(board , row , col+1) == true){
                return true ;
            }
            board[row][col] = '.';
        }
       }
       return false ; //if no valid no found 
        
}

boolean isValid(char[][] board , int row , int col , char ch){
    for(int i= 0 ; i<9;i++){
        if(board[row][i]== ch  || board[i][col] == ch){
            return false ;
        }
    }

        int rowX = row - row % 3;
        int colY = col - col % 3;

        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        if (board[rowX + i][colY + j] == ch) {
            return false;
        }
    }
}
return true ;

}

}