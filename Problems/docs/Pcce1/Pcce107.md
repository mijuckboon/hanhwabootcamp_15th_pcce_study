# PCCE 1-07
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/250127)

## 문제 정보
* 빈칸 채우기 문제

### 문제 코드
```java
import java.util.Scanner;

public class Solution {
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return <빈칸>;
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        <빈칸>
            <빈칸>; 
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return <빈칸>; 
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func<빈칸>; 
        }
        else if(mode_type.equals("target")){
            answer = func<빈칸>;
        }
        else if(mode_type.equals("minimum")){
            answer = func<빈칸>;
        }

        return answer;
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

public class Solution {
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3; // 채운 부분
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else // 채운 부분
            return 5; // 채운 부분
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0; // 채운 부분
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity); // 채운 부분
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set); // 채운 부분
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set); // 채운 부분
        }

        return answer;
    }
}
```

### 코멘트
코드가 길어서 은근 귀찮. `func2`의 argument는 1개 뿐인데 2개 다 쓰는 실수 했었음