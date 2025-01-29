# PCCE 2-08
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/340200)

## 문제 정보
* 디버깅 문제

### 문제 코드
```java
import java.util.Scanner;

class Solution {
    public String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        if(answer.length() < 3){
            answer += "o";
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

class Solution {
    public String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        while(answer.length() < 4){ // 수정한 부분
            answer += "o";
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}
```

### 코멘트
`if` 문을 `while` 문으로 바꾸고, 뒤에 숫자도 4로 수정해야 했던 디버깅 문제