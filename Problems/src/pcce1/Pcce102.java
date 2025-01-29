package pcce1;

import java.util.Scanner;

public class Pcce102 { // compile 돌려볼 수 있게 이름 변경
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c*c - a*a;

        System.out.println(b_square);
    }
}