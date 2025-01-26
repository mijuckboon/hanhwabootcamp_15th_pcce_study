# PCCE 1-06
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/250128)

## 문제 정보
* 빈칸 채우기 문제

### 문제 코드
```java
import java.util.Scanner;

public class Solution {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[i]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

public class Solution {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) { // 수정한 부분
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
```

### 코멘트
`if` 문 안의 조건을 건드려야 했던 문제. 은근 쉽지 않았던 듯?