package daily;
import java.util.Scanner;

public class Day0103 { // https://school.programmers.co.kr/learn/courses/30/lessons/181950
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        // System.out.println(str.repeat(n));
        for(int i=0;i<n;i++){
            System.out.print(str);
        }
    }
}
