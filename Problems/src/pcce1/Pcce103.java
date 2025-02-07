package pcce1;

import java.util.Scanner;

public class Pcce103 { // compile 돌려볼 수 있게 이름 변경
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) { // 채운 부분
            answer = 2030-year+1; // 채운 부분
        }
        else if (age_type.equals("Year")) {
            answer = 2030-year; // 채운 부분
        }

        System.out.println(answer);
    }
}