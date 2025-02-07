# PCCE 2-05
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/340203)

## 문제 정보
* 빈칸 채우기 문제

### 문제 코드
```java
public class Solution {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i<<빈칸>; i++){
            for(int j=0; j<<빈칸>; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = <빈칸>;
                    break;
                }
            }
        }
        return answer;
    }
}
```

### 제출 정답
```java
class Solution {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i<basic_order.length; i++){ // 채운 부분: 사실 cpr.length 왔어야 함
            for(int j=0; j<basic_order.length; j++){ // 채운 부분
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j+1; // 채운 부분
                    break;
                }
            }
        }
        return answer;
    }
}
```

### 코멘트
1. `j`가 아닌 `j+1`임에 유의하자.
2. `cpr`과 `basic_order`의 길이가 같아서 결과적으로는 맞았으나, 사실 틀린 코드인 것 같다.
첫 번째 `for`문 안을 `cpr.length`로 적었어야 올바른 답인 듯
3. Java 문법: `array.length` (attribute), `String.length()` (method)