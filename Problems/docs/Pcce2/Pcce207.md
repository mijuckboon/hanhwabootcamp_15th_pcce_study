# PCCE 2-07
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/340201)

## 문제 정보
* 빈칸 채우기 문제

### 문제 코드
```java
import java.util.Scanner;

class Solution {
    public int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for(int i=0; i<passengers.length; i++){
            num_passenger += func<빈칸>;
            num_passenger -= func<빈칸>;
        }
        int answer = func<빈칸>;
        return answer;
    }

    public int func1(int num){
        if(0 > num){
            return 0;
        }
        else{
            return num;
        }
    }
    public int func2(int num){
        if(num > 0){
            return 0;
        }
        else{
            return num;
        }
    }

    public int func3(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("Off")){
                num += 1;
            }
        }
        return num;
    }

    public int func4(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("On")){
                num += 1;
            }
        }
        return num;
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

class Solution {
    public int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for(int i=0; i<passengers.length; i++){
            num_passenger += func4(passengers[i]); // 채운 부분
            num_passenger -= func3(passengers[i]); // 채운 부분
        }
        int answer = func1(seat-num_passenger); // 채운 부분
        return answer;
    }

    public int func1(int num){
        if(0 > num){
            return 0;
        }
        else{
            return num;
        }
    }
    public int func2(int num){
        if(num > 0){
            return 0;
        }
        else{
            return num;
        }
    }

    public int func3(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("Off")){
                num += 1;
            }
        }
        return num;
    }

    public int func4(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("On")){
                num += 1;
            }
        }
        return num;
    }
}
```

### 코멘트
코드 드럽게 길어서 보기 힘들었음 ㅡㅡ