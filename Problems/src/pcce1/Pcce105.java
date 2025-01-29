package pcce1;

public class Pcce105 { // compile 돌려볼 수 있게 이름 변경
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--; // 채운 부분
                    break;
                case 'E':
                    east++; // 채운 부분
                    break;
                case 'W':
                    east--; // 채운 부분
                    break; // 채운 부분
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}