public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        // System.arraycopy(복사할 배열, 복사할 인덱스 시작 위치, 복사받을 배열, 복사받을 배열 인덱스 시작 위치, 복사할 길이)
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (String str : newStrArray)
            System.out.print(str + " ");
    }
}
