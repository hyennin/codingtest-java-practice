import java.util.Arrays;

public class ArrayBinarySearchExample {
    public static void main(String[] args) {
//        Arrays.binarySearch(배열, 찾을 값)
//        정렬 후 사용해야함

        int[] arr = {3, 2, 0, 1, 4};
//        int idx = Arrays.binarySearch(arr, 2); // idx = -5 <- 잘못된 결과

        Arrays.sort(arr); // 배열 정렬
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]
        int idx = Arrays.binarySearch(arr, 2); // idx = 2 <- 올바른 결과
        System.out.println("검색 결과 : " + idx);
    }
}
