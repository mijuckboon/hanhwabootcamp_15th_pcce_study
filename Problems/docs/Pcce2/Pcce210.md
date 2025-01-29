# PCCE 2-10
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/340198)

## 문제 정보
* 코드 작성 문제

### 제출 정답
```java
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        for (int mat : mats) {
            if (answer > mat) {
                continue;
            }

            for (int i = 0; i <= park.length - mat; i++) {
                for (int j = 0; j <= park[0].length - mat; j++) {
                    if (canPlace(i,j,mat,park)) {
                        answer = mat;
                    }
                }
            }

        }
        return answer;
    }

    public boolean canPlace(int i, int j, int mat, String[][] park) {
        for (int k = 0; k < mat; k++) {
            for (int l = 0; l < mat; l++) {
                if (!park[i+k][j+l].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }

}
```

### 코멘트
1. 2차원 배열에 대한 brute force 문제
2. flag 로직 부분 구현 못해서 chatGPT 도움 받았음
3. i, j `for`문: 부등호 아니고 등호여야 함