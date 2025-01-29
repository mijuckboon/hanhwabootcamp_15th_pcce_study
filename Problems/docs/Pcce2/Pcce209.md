# PCCE 2-09
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/340199)

## 문제 정보
* 코드 작성 문제

### 제출 정답
```java
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int minBill = min(bill);
        int minWallet = min(wallet);
        int maxBill = max(bill);
        int maxWallet = max(wallet);

        while(minBill > minWallet || maxBill > maxWallet) {
            if(bill[0] > bill[1]){
                bill[0] /= 2;
            }
            else {
                bill[1] /= 2;
            }
            answer += 1;
            minBill = min(bill);
            maxBill = max(bill);
        }
        return answer;
    }

    public int min(int[] container) {
        int left = container[0];
        int right = container[1];
        if(left > right) {
            return right;
        }
        return left;
    }

    public int max(int[] container) {
        return container[0]+container[1]-min(container);
    }
}
```

### 코멘트
1. `Math.max`와 `Math.min` 쓰는 형태로 리팩토링 가능 (`.java` 파일에 반영)
    * 더 좋은 방법이 있다면 피드백 환영
    * N개짜리 max, min 구하는 로직도 상기해보자.
2. `container` 보다는 `numbers`가 더 좋은 변수명
3. 꽤 많이 헤맸던 문제. 조건 잘 읽고 문제 풀 것!
   1. max, min 둘 다 필요한거 체크 안함
   2. min 함수의 부등호 반대로 씀 (<, <=는 무관)
   3. minBill만 업데이트 하고 maxBill은 업데이트 안함
   4. "크면"인데 `>=` 써서 터짐