package daily;
import java.util.Scanner;

public class Day0203 { // https://school.programmers.co.kr/learn/courses/30/lessons/181945
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] chars = a.toCharArray();
        for (char character : chars) {
            System.out.println(character);
        }
    }
}
// charAt
// char -> String String.valueOf
// Character.toString: array에 적용 불가