# PCCE 2-02
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/340206)

## 문제 정보
* 디버깅 문제

### 문제 코드
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        System.out.println(sum_angle);
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2; // 여기서 수정했어도 될 듯?
        System.out.println(sum_angle%360); // 수정한 부분
    }
}
```

### 코멘트
간단한 디버깅 문제