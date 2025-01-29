# PCCE 2-06
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/340202)

## 문제 정보
* 디버깅 문제

### 문제 코드
```java
import java.util.Scanner;

class Solution {
    class Solution {
        public int solution(int storage, int usage, int[] change) {
            int total_usage = 0;
            for(int i=0; i<change.length; i++){
                usage = total_usage * change[i] / 100;
                total_usage += usage;
                if(total_usage > storage){
                    return i;
                }
            }
            return -1;
        }
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

class Solution {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage += usage * change[i] / 100; // 수정한 부분
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}
```

### 코멘트
디버깅 문제. 찾는 데 은근히 오래 걸렸던 것으로 기억