# PCCE 1-10

## 문제 정보
* 코드 작성 문제

### 제출 정답
```java
import java.util.List;
import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        List<String> columns = new ArrayList<String>(List.of("code", "date", "maximum", "remain"));
        int ext_index = columns.indexOf(ext);
        int sort_index = columns.indexOf(sort_by);
        int row_cnt = 0;

        for (int[] row : data) {
            if (row[ext_index] < val_ext) {
                row_cnt += 1;
            }
        }

        int[][] filteredData = new int[row_cnt][];
        int idx = 0;
        for (int[] row : data) {
            if (row[ext_index] < val_ext) {
                filteredData[idx] = row;
                idx += 1;
            }
        }

//        Arrays.sort(filteredData, Comparator.comparingInt(row -> row[sort_index]));
//        return filteredData; 
        return sort(filteredData, sort_index);
    }

    int[][] sort(int[][] input, int sort_index) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < i; j++) {
                if (input[i][sort_index] < input[j][sort_index]) {
                    int[] tmp;
                    tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
        }
        return input;
    }
}
```

### 코멘트
1. 2차원 배열 처리 부분이 쉽지 않았음 (java 자료형 이슈)
2. 정렬 함수 기억하기
   * 배열: `Arrays.sort()`
   * `List`: `Collections.sort()`
   * 내림차순: `Comparator.reverseOrder()`