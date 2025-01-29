package daily;
import java.util.Scanner;

public class Day0204 { // https://school.programmers.co.kr/learn/courses/30/lessons/181944
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println(n+" is even");
        } else {
            System.out.println(n+" is odd");
        }
        // String even = " is even";
        // String answer = n + even;
        // System.out.println(answer);
    }
}
