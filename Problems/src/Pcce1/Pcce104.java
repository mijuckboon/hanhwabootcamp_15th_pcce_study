package Pcce1;

import java.util.Scanner;

public class Pcce104 { // compile 돌려볼 수 있게 이름 변경
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before; // 채운 부분
            month++;
        }
        while (money < 100) { // 채운 부분
            money += after; // 채운 부분
            month++;
        }

        System.out.println(month);
    }
}