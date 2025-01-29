package pcce1;

public class Pcce109 { // compile 돌려볼 수 있게 이름 변경
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        int[] dh = new int[] {0,1,-1,0};
        int[] dw = new int[] {1,0,0,-1};

        for (int i = 0; i <= 3; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if (isValidPosition(h_check, w_check, n)) {
                if (board[h][w].equals(board[h_check][w_check])) {
                    count += 1;
                }
            }
        }

        return count;
    }
    boolean isValidPosition(int i, int j, int n) {
        if (i >= 0 && i < n && j >= 0 && j < n) {
            return true;
        }
        return false;
    }
}