package daily;
import java.util.Scanner;

public class Day0104 { // https://school.programmers.co.kr/learn/courses/30/lessons/181949
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] chars = a.toCharArray();
        for(char character : chars) {
            if (character >= 97 && character <= 123) {
                System.out.print((char) (character-97+65));
            } else {
                System.out.print((char) (character+97-65));
            }
        }
    }
}
