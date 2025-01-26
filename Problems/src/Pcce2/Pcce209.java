package Pcce2;

public class Pcce209 { // compile 돌려볼 수 있게 이름 변경
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int minBill = min(bill);
        int minWallet = min(wallet);
        int maxBill = max(bill);
        int maxWallet = max(wallet);

        while(minBill > minWallet || maxBill > maxWallet) {
            if(bill[0] > bill[1]){
                bill[0] /= 2;
            }
            else {
                bill[1] /= 2;
            }
            answer += 1;
            minBill = min(bill);
            maxBill = max(bill);
        }
        return answer;
    }

    public int min(int[] numbers) {
        int left = numbers[0];
        int right = numbers[1];
        return Math.min(left, right);
    }

    public int max(int[] numbers) {
        int left = numbers[0];
        int right = numbers[1];
        return Math.max(left, right);
    }
}