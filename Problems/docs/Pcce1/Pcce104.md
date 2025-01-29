# PCCE 1-04
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/250130)

## 문제 정보
* 빈칸 채우기 문제

### 문제 코드
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += <빈칸>;
            month++;
        }
        while (<빈칸> < 100) { 
            <빈칸>;
            month++;
        }

        System.out.println(month);
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before; // 채운 부분
            month++;
        }
        while (money < 100) { // 채운 부분
            money += after; // 채운 부분
            month++;
        }

        System.out.println(month);
    }
}
```

### 코멘트
간단한 빈칸 채우기 문제
