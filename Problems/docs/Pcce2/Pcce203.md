# PCCE 2-03
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/340205)

## 문제 정보
* 디버깅 문제

### 문제 코드
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for(int i=0; i<1; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        while(number > 0){ // 수정한 부분
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
```

### 코멘트
`for` 문을 `while`문으로 변경해야 했던 문제