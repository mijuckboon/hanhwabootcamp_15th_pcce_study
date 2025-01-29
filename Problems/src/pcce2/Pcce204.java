package pcce2;

import java.util.Scanner;

public class Pcce204 { // compile 돌려볼 수 있게 이름 변경
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