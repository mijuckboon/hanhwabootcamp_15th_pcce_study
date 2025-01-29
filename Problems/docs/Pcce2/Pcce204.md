# PCCE 2-04
[문제 바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/340204)

## 문제 정보
* 빈칸 채우기 문제

### 문제 코드
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals(<빈칸>)){
            System.out.println("Ophthalmologyc");
        }
        else if(<빈칸>){
            System.out.println("Neurosurgery");
        }
        else if(<빈칸>){
            System.out.println("Orthopedics");
        }
        <빈칸>
        {
            System.out.println("Dermatology");
        }
        <빈칸>
        {
            System.out.println("direct recommendation");
        }
    }
}
```

### 제출 정답
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("_eye")){ // 채운 부분
            System.out.println("Ophthalmologyc");
        }
        else if(lastFourWords.equals("head")){ // 채운 부분
            System.out.println("Neurosurgery");
        }
        else if(lastFourWords.equals("infl")){ // 채운 부분
            System.out.println("Orthopedics");
        }
        else if(lastFourWords.equals("skin")){ // 채운 부분
            System.out.println("Dermatology");
        }
        else{ // 채운 부분
            System.out.println("direct recommendation");
        }
    }
}
```

### 코멘트
`if`-`else if`-`else` 문 빈칸 채우기