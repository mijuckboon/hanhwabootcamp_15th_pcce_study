package pcce2;

public class Pcce205 { // compile 돌려볼 수 있게 이름 변경
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