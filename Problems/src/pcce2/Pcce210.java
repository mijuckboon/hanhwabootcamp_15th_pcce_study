package Pcce2;

public class Pcce210 { // compile 돌려볼 수 있게 이름 변경
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        for (int mat : mats) {
            if (answer > mat) {
                continue;
            }

            for (int i = 0; i <= park.length - mat; i++) {
                for (int j = 0; j <= park[0].length - mat; j++) {
                    if (canPlace(i,j,mat,park)) {
                        answer = mat;
                    }
                }
            }

        }
        return answer;
    }

    public boolean canPlace(int i, int j, int mat, String[][] park) {
        for (int k = 0; k < mat; k++) {
            for (int l = 0; l < mat; l++) {
                if (!park[i+k][j+l].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}