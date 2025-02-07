package pcce1;
import java.util.List;
import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;

public class Pcce110 { // compile 돌려볼 수 있게 이름 변경
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        List<String> columns = new ArrayList<String>(List.of("code","date","maximum","remain"));
        int ext_index = columns.indexOf(ext);
        int sort_index = columns.indexOf(sort_by);
        int row_cnt = 0;

        for (int[] row: data) {
            if (row[ext_index] < val_ext) {
                row_cnt += 1;
            }
        }

        int[][] filteredData = new int[row_cnt][];
        int idx = 0;
        for (int[] row: data) {
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
            for (int j = 0; j < i; j ++) {
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