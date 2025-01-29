package pcce2;

import java.util.Scanner;

public class Pcce202 { // compile 돌려볼 수 있게 이름 변경
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2; // 여기서 수정했어도 될 듯?
        System.out.println(sum_angle % 360); // 수정한 부분
    }
}