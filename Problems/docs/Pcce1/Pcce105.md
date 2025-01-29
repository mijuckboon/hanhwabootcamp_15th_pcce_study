# PCCE 1-05
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/250129)

## 문제 정보
* 빈칸 채우기 문제

### 문제 코드
```java
import java.util.Scanner;

public class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    <빈칸>;
                    break;
                case 'E':
                    <빈칸>;
                    break;
                case 'W':
                    <빈칸>;
                    <빈칸>;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

public class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--; // 채운 부분
                    break;
                case 'E':
                    east++; // 채운 부분
                    break;
                case 'W':
                    east--; // 채운 부분
                    break; // 채운 부분
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
```

### 코멘트
간단한 빈칸 채우기 문제