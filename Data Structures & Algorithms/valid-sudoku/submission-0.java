class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean row[][]=new boolean [9][9], col[][]=new boolean [9][9], box[][]=new boolean [9][9];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                char ch=board[i][j];
                if(ch=='.')continue;
                int num=ch-'1';//0-8
                int boxind=(i/3)*3+(j/3);
                if(row[i][num]||col[j][num]||box[boxind][num])return false;
                row[i][num]=box[boxind][num]=col[j][num]=true;
            }
        }
        return true;
    }
}
