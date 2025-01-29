# PCCE 1-01
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/250133)

## 문제 정보
* 빈칸 채우기 문제

### 문제 코드
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String msg = <빈칸>;
        int val1 = <빈칸>;
        String val2 = <빈칸>;
        
        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String msg = "Spring is beginning"; // 채운 부분
        int val1 = 3; // 채운 부분
        String val2 = "3"; // 채운 부분

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }
}
```

### 코멘트
간단한 빈칸 채우기 문제. (`int` vs `String`)