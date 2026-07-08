class Solution {
    public boolean isValidSudoku(char[][] board) {
        //for row.
        for(int i = 0;i<board.length;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }
        //for column.
        for(int j = 0;j<board[0].length;j++){
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<board.length;i++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }
        //for(3x3 boxes).
        for(int i=0;i<9;i+=3){
            for(int j =0;j<9;j+=3){
                HashSet<Character> set= new HashSet<>();
                for(int r = 0;r<3;r++){
                    for(int c = 0;c<3;c++){
                        if(board[i+r][j+c] == '.') continue;
                        if(set.contains(board[i+r][j+c])) return false;
                        set.add(board[i+r][j+c]);
                    }
                }
            }
        }
        return true;
    }
}
