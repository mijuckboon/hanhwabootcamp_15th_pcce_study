package daily;

public class Day0402 { // https://school.programmers.co.kr/learn/courses/30/lessons/181936
    public int solution(int number, int n, int m) {
        int answer = 0;
        if (number % n == 0 && number % m == 0) {
            return 1;
        }
        return answer;
    }
}
