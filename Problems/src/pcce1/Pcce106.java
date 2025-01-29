package pcce1;

public class Pcce106 { // compile 돌려볼 수 있게 이름 변경
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) { // 수정한 부분
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}