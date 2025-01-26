package Pcce2;

import java.util.Scanner;

public class Pcce203 { // compile 돌려볼 수 있게 이름 변경
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        while(number > 0){ // 수정한 부분
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}