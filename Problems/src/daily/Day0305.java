package daily;

public class Day0305 { // https://school.programmers.co.kr/learn/courses/30/lessons/181938
    public int solution(int a, int b) {
        int answer = 0;
        answer = Integer.parseInt(a + "" + b);
        int compare = 2*a*b;
        if (answer < compare) {
            return compare;
        }
        return answer;
    }
}
