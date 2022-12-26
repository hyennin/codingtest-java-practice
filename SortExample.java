import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        String[] str = {"a", "1", "가", "A", "3", "나"};

        // 정렬 전
        for (String s : str) {
            System.out.print(s + " ");
        }

        System.out.println();

//      // 오름차순
//        Arrays.sort(str);
        // 내림차순
        Arrays.sort(str, Collections.reverseOrder());
        
        // 정렬 후
        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}
