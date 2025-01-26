package Pcce2;

public class Pcce206 { // compile 돌려볼 수 있게 이름 변경
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