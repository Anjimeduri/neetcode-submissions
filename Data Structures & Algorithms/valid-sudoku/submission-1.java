class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet();
            cols[i] = new HashSet();
            boxes[i] = new HashSet();
        }
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];
                int boxIndex = (row / 3) * 3 + (col / 3); // imp

                if (value != '.') {
                    if (!rows[row].add(value) || !cols[col].add(value)
                        || !boxes[boxIndex].add(value)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
