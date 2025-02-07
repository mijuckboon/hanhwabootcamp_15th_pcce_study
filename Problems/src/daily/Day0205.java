package daily;

public class Day0205 { // https://school.programmers.co.kr/learn/courses/30/lessons/181943
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder init = new StringBuilder().append(my_string);
        String answer = init.replace(s, s+overwrite_string.length(), overwrite_string).toString();
        return answer;
    } // substring 이용하는 게 더 좋은 방법
}
