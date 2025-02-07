# PCCE 1-03
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/250131)

## 문제 정보
* 빈칸 채우기 문제

### 문제 코드
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals(<빈칸>)) {
            answer = <빈칸>;
        }
        else if (age_type.equals("Year")) {
            <빈칸>;
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
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) { // 채운 부분
            answer = 2030-year+1; // 채운 부분
        }
        else if (age_type.equals("Year")) {
            answer = 2030-year; // 채운 부분
        }

        System.out.println(answer);
    }
}
```

### 코멘트
간단한 빈칸 채우기 문제. 문제를 잘 읽고 따라가면 어렵지 않음.