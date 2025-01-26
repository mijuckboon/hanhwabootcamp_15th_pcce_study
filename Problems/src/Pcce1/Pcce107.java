package Pcce1;

public class Pcce107 { // compile 돌려볼 수 있게 이름 변경
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3; // 채운 부분
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else // 채운 부분
            return 5; // 채운 부분
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0; // 채운 부분
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity); // 채운 부분
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set); // 채운 부분
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set); // 채운 부분
        }

        return answer;
    }
}