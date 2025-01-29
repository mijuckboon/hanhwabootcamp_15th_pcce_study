# PCCE 1-09
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/250125)

## 문제 정보
* 코드 작성 문제

### 제출 정답
```java
class Solution {
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
```

### 코멘트
문제에 주어진 pseudo code 그대로 코드로 작성만 하면 되는 쉬운 코드 작성 문제