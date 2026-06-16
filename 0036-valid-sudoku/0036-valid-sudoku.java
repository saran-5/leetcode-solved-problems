class Solution {
    public boolean isValidSudoku(char[][] board) {
         int n = board.length;
        // create an array of size n(9), each entry of array is of type HashSet
        Set<Character>[] rows = new HashSet[n];
        Set<Character>[] cols = new HashSet[n];
        Set<Character>[] box = new HashSet[n];
        // Arrays are created but empty (null). We need to initialize each element with a new HashSet.
        for (int i = 0; i < n; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            box[i] = new HashSet<Character>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char curr = board[i][j];
                if (curr == '.') {
                    continue;
                }
                if (rows[i].contains(curr)) {
                    return false;
                } else {
                    rows[i].add(curr);
                }
                if (cols[j].contains(curr)) {
                    return false;
                } else {
                    cols[j].add(curr);
                }
                int boxIdx = (i / 3) * 3 + (j / 3);
                if (box[boxIdx].contains(curr)) {
                    return false;
                } else {
                    box[boxIdx].add(curr);
                }
            }
        }
        return true;
    }
}