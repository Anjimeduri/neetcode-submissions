class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> uniqChars = new HashSet();

        for(int row = 0; row < 9;row++) {
                uniqChars = new HashSet<>();

            for(int col = 0; col < 9; col++) {
                if(board[row][col] != '.' && !uniqChars.add(board[row][col])){
                    return false;
                }
            }
        }

        for(int col = 0; col < 9; col++) {
                uniqChars = new HashSet<>();

            for(int row = 0; row < 9; row++) {
                if(board[row][col] != '.' && !uniqChars.add(board[row][col])){
                    return false;
                }
            }
        }

        for(int rowIndex= 0; rowIndex < 9; rowIndex +=3) {
            for(int colIndex = 0; colIndex<9; colIndex += 3) {
                uniqChars = new HashSet();
                for(int row = rowIndex; row < rowIndex + 3; row++) {
                    for(int col = colIndex; col < colIndex + 3; col++) {
                        if(board[row][col] != '.' && !uniqChars.add(board[row][col])){
                            return false;
                        }
                    }
                }
            }
        }
        
        return true;
    }
}
