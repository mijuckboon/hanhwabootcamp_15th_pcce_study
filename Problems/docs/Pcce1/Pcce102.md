# PCCE 1-02
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/250132)

## 문제 정보
* 디버깅 문제

### 문제 코드
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c - a;

        System.out.println(b_square);
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c*c - a*a; // 수정한 부분

        System.out.println(b_square);
    }
}
```

### 코멘트
간단한 디버깅 문제